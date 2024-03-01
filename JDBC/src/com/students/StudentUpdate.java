package com.students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentUpdate {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/student";
			String user = "postgres";
			String password = "root";
			Connection scr = DriverManager.getConnection(url, user, password);
			Statement s = scr.createStatement();
			String fetch = "update student set phone = '9955446348' where name = 'jeewan'";
			s.execute(fetch);
			System.out.println("Record updated sucessfully");
			scr.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
