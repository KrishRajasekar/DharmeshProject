package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JavaDatabaseConnection {
	
	public static void main(String[] args) throws Exception {
		
		//1.to load the driver 
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		//2. to connect to the database (database connection)
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","hr","system");	
		//3. to form sql query
		String query = "select * from employees";
		//4.to prepare the statement
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		//5.to execute the query
		ResultSet resultSet = preparedStatement.executeQuery();
		//6.to print the result set data
		while(resultSet.next()){
		String string = resultSet.getString("employee_id");
		System.out.println(string);	
		
		
		
		}
		
	
}
		
	}


