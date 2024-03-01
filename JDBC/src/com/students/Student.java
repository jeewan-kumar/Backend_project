package com.students;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Student {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/student";
			String user = "postgres";
			String password ="root";
			Connection  str= DriverManager.getConnection(url, user, password);
			Statement s = str.createStatement();
			String query ="create table student (id serial primary key,name varchar(50) not null,phone varchar(20),password varchar(50))";
			s.execute(query);
			System.out.println("Table created successfully");
			str.close();			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}