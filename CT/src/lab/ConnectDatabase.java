package lab;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDatabase {
	static final String USER = "root";
	static final String PASS = "";
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/cqtest?characterEncoding=utf8";
    public static Statement connection()
    {
    	Connection conn = null; 
        Statement stmt = null;
    	try {
			Class.forName(JDBC_DRIVER);
			System.out.println("连接数据库...");
	        conn = DriverManager.getConnection(DB_URL,USER,PASS); 
	        // 执行查询
	        System.out.println(" 实例化Statement对象...");
	        stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e)
    	{
			e.printStackTrace();
    	}
		return stmt;
    }
    
}
