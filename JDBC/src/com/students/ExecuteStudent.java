package com.students;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExecuteStudent {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/student";
			String user = "postgres";
			String password = "root";
			Connection connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			//String inserted = "insert into student values(5,'jeewan',7870794231,'jeevan@123')";
			boolean result = statement.execute("insert into student values(5,'jeewan',7870794231,'jeevan@123')");
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
