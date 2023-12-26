// package Sql_JDBC;

// public class Connection {
    
// }
import java.sql.*;
import java.sql.Connection;
import java.Statement;

public class JDBC_Connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		try {
			//CONNECTION
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shivam","123");
			
			
			//Statement
			Statement smt=conn.createStatement();
			smt.executeUpdate("create table emps(eno number");
			System.out.println("Success");
		}
		catch(Exception e)  
		{
			System.out.println(e);
		}
	}

}

