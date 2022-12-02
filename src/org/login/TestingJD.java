package org.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestingJD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Load the driver
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// Connect a database
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		
		// Write a SQL Query
		
		String sql=" Select * from FbLogin";
		
		// Prepare the statement
		
		PreparedStatement prepareStatement = con.prepareStatement(sql);
		
		// Execute query
		ResultSet result = prepareStatement.executeQuery();
		
		//Iterate the results
		
		while (result.next()) {
			String username = result.getString("USERNAME");
			System.out.print(username+"\t");
			String password = result.getString("PASSWORD");
			System.out.print(password);
			System.out.println();
			
		}
		// Close the connection
		con.close();
	}
}
