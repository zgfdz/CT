package lab;

import java.util.Stack;


class Productino{
	int ProductionId;
	String Prod;
}

//class LRTable11 {
//	public int state;
//	   /** @pdOid 48f3e5db-3a54-4aaa-bb70-e367d69c5520 */
//	public int opt;
//	   /** @pdOid dcc255c0-479a-4e8b-a167-1b947cfc6cb0 */
//	public static Character getActionType(int s,String c) {
//		   return 's';   
//	   }
//	public static Character getActionId(int s,String c) {
//		   return 's';   
//	   }
//	public static int getGotoId(int top) {
//		  return 1;
//	}
//	
//}

public class Grammar{
//	Stack <Integer>  state_stack;
//	Stack <String>  symbol_stack;
	static Stack <Integer>  state_stack = new Stack<Integer>(); 
	static Stack <String>  symbol_stack = new Stack<String>(); 
	
	// initialize nfa
	state_transition_graph nfa=new state_transition_graph(0);
	
	// or
	static String NFA_or_combine(String id1,String id2) {
		return "ss";
	}
	
	//and
	static String NFA_connect_combine(String id1,String id2) {
		return "ss";
	}
	
	//#
	static String NFA_plus_closure(String id) {
		return "ss";
	}
	
	//@
	static String NFA_closure(String id) {
		return "ss";
	}
	
	//?
	static String NFA_zero_one(String id) {
		return "ss";
	}
	
	//id
	static String generate_new_basic_NFA(String id) {
		return "ss";
	}
	
	
	//规约函数：
static void reduce( int production_id, String a) {
	String NFA_graph_id_1,NFA_graph_id_2,NFA_graph_id;
	switch(production_id) {
		case 1: //按 EE | E 规约
			NFA_graph_id_1 = symbol_stack.pop( );
			NFA_graph_id_2 = symbol_stack.pop( );
			NFA_graph_id = NFA_or_combine(NFA_graph_id_1, NFA_graph_id_2);
			symbol_stack.push(NFA_graph_id );
			state_stack.pop(); //该产生式的左部有三个符号，弹出三个
			state_stack.pop();
			state_stack.pop();
			break;
		case 2: //按 EE & E 规约
			NFA_graph_id_1 = symbol_stack.pop( );
			NFA_graph_id_2 = symbol_stack.pop( );
			NFA_graph_id = NFA_connect_combine(NFA_graph_id_1, NFA_graph_id_2);
			symbol_stack.push(NFA_graph_id );
			state_stack.pop(); //该产生式的左部有三个符号，弹出三个
			state_stack.pop();
			state_stack.pop();
			break;
		case 3: //按 E(E)规约
			state_stack.pop(); //该产生式的左部有三个符号，弹出三个
			state_stack.pop();
			state_stack.pop();
			break;
		case 4: //按 EE#规约
			NFA_graph_id_1 = symbol_stack.pop( );
			NFA_graph_id = NFA_plus_closure(NFA_graph_id_1);
			symbol_stack.push(NFA_graph_id );
			state_stack.pop(); //该产生式的左部有二个符号，弹出二个
			state_stack.pop();
			break;
		case 5: //按 EE@规约
			NFA_graph_id_1 = symbol_stack.pop( );
			NFA_graph_id = NFA_closure(NFA_graph_id_1);
			symbol_stack.push(NFA_graph_id );
			state_stack.pop(); //该产生式的左部有二个符号，弹出二个
			state_stack.pop();
			break;
		case 6: //按 EE？规约
			NFA_graph_id_1 = symbol_stack.pop( );
			NFA_graph_id = NFA_zero_one(NFA_graph_id_1);
			symbol_stack.push(NFA_graph_id );
			state_stack.pop(); //该产生式的左部有二个符号，弹出二个
			state_stack.pop();
			break;
		case 7://按 Eid 规约
			String driver_char_id = symbol_stack.pop( ); //所有字符都用 element 表中的element_id 表示。
			NFA_graph_id = generate_new_basic_NFA(driver_char_id);
			symbol_stack.push(NFA_graph_id );
			state_stack.pop(); //该产生式的左部有一个符号，弹出一个
			break;
		default:
			break;
	}
	}


public static void main(String[] argv) {
	
//	Stack <Integer>  state_stack = new Stack<Integer>(); 
//	Stack <String>  symbol_stack = new Stack<String>(); 
	
	
//	state_stack.Clear();
//	symbol_stack.Clear();
	
	state_stack.push(0); //初始化：把 0 状态入栈
	char action_type; //
	int top_state; //状态栈的栈顶元素的状态号
	int next_state;
	int production_id;
	while (!state_stack.empty()) {
		Lexeme a = LexemeAnalysis.getLexemeId( ); //调用词法分析函数得到一个词素
		int top = state_stack.peek();
		action_type = LRTable.getActionType(top, a.judgeId());
		if (action_type =='s') { //移入
			next_state = LRTable.getActionId(top, a.judgeId());
			//执行移入操作：
//			if (a.type == "id") {//a 要么为 id(0)，要么为运算符，只有这两种类型。
				symbol_stack.push(a.judgeId());
//			}
			   state_stack.push(next_state);
			
		}
	else if (action_type == 'r') { //规约
				production_id = LRTable.getActionId(top,  a.judgeId());
				reduce( production_id,a.value);
				//接下来执行 GOTO 操作：
				top = state_stack.peek();
				next_state = LRTable.getGotoId(top);
				state_stack.push(next_state);
				}
	else if (action_type == 'a') { //接受
				break;
				}
			
	else { //语法错误正则表达式有语法错误；
	break;
	}


	}

}
}