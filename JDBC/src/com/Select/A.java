package com.Select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class A {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/student";
			String user = "postgres";
			String password = "root";
			Connection connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			String select = "select * from student";
			statement.execute(select);
			ResultSet resultSet = statement.getResultSet();
			System.out.println(resultSet.next());
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString("name"));
			System.out.println(resultSet.next());
			
			System.out.println("select sucessfully");
			connection.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
