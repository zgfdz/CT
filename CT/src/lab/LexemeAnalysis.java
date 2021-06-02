package lab;
import java.sql.*;
import java.util.*;

class Lexeme { 
	String type; //两种取值：’id’表示自定义符； ’reserved’表示预定义符；
	String value; //取值 
	
	public String judgeId() {
		if(type=="id") {
			return "id";
		}
		else {
			return value;
		}
	}
}
public class LexemeAnalysis {
	static String regex;
	static int index = 4;
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Lexeme le = new Lexeme();
		LexemeAnalysis lexeme = new LexemeAnalysis();
		while(input.hasNext())
		{
			regex = input.next();
			le=lexeme.getLexemeId();
			while(le.type!="end") {
				if(le.type.equals("error"))
				{
					System.out.println(le.type);
					break;
				}
				System.out.println(le.type);
				System.out.println(le.value);
				le=lexeme.getLexemeId();
			}
		}
	}
	static char getNextChar()
	{
		if(index<regex.length())
		{
			return regex.charAt(index++);
		}
		else
		{
			index++;
			return '~';
		}
	}
	
	static void unGetChar()
	{
		index = index - 1;
	}
	
	static boolean regex2Num()
	{
		ConnectDatabase con = new ConnectDatabase();
		Statement stmt = con.connection();
		String sql;
		String replaceStat = "";
		int i = 0;
		char a,b = ' ';
		for(i=0;i<regex.indexOf('-');i++)
		{
			b = regex.charAt(i);
			if(b!='n'&&b!='i'&&b!='r')
			{
				return false;
			}
			sql = "select element_id,class_id from element where class_id = 'v' and binary name = '" + b + "'";
			try {
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next())
				{
					//System.out.println(rs.getShort("element_id"));
					replaceStat += String.valueOf(rs.getShort("element_id"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(;i<regex.length();i++)
		{
			a = regex.charAt(i);
			if((a<='Z'&&a>='A')||(a<='z'&&a>='a')||(a<='9'&&a>='0'))
			{
				sql = "select element_id,class_id from element where class_id = 'c' and binary name = '" + a + "'";
				try {
					ResultSet rs = stmt.executeQuery(sql);
					while(rs.next())
					{
						//System.out.println(rs.getShort("element_id"));
						replaceStat += String.valueOf(rs.getShort("element_id"));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				replaceStat += a;
			}
		}
		regex = replaceStat;
		if(b=='n')
		{
			sql = "insert into regular_expression(head_element_id,expression,lexcial_class) values(62,'"+regex+"','n')";
		}
		else if(b=='i')
		{
			sql = "insert into regular_expression(head_element_id,expression,lexcial_class) values(63,'"+regex+"','i')";
		}else if(b=='r')
		{
			sql = "insert into regular_expression(head_element_id,expression,lexcial_class) values(64,'"+regex+"','r')";
		}
		else {
			return false;
		}
		try {
			boolean rs = stmt.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(regex);
		return true;
	}
	
	enum StateType { START,INELEMENT,DONE }

	static boolean isdigit(char c) {
		if(c<='9'&&c>='0')
			return true;
		else 
			return false;
	}
	
	public static Lexeme getLexemeId()
	{
		boolean flag = regex2Num();	
		Lexeme lexeme = new Lexeme();
		if(!flag)
		{
			lexeme.type = "error";
			return lexeme;
		}
		String ele="";
		StateType state= StateType.START;
		while(state != StateType.DONE) {
			char a = getNextChar();
			switch(state) {
				case START:
					if(isdigit(a)) {
						state=StateType.INELEMENT;
						ele+=a;
					}
					else {
						state=StateType.DONE;
						switch(a) {
							case '~':
								lexeme.type="end";
								break;
							case '|':
								lexeme.type = "o";
								lexeme.value="|";
								break;
							case '&':
								lexeme.type = "o";
								lexeme.value="&";
								break;
							case '@':
								lexeme.type = "o";
								lexeme.value="@";
								break;
							case '#':
								lexeme.type = "o";
								lexeme.value="#";
								break;
							case '?':
								lexeme.type = "o";
								lexeme.value="?";
								break;
							case '(':
								lexeme.type = "o";
								lexeme.value=")";
								break;
							case ')':
								lexeme.type = "o";
								lexeme.value=")";
								break;
							default:
								lexeme.type = "error";
								break;
						}
						
					}
					break;
				case INELEMENT:
					if(!isdigit(a)) {
						state = StateType.DONE;
						lexeme.type = "e";
						lexeme.value = ele;
						unGetChar();
					}
					else {
						ele += a;
					}
					break;
			}
		}
		return lexeme;
	}
}
