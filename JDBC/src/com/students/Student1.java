package com.students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student1 {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/student";
			String user = "postgres";
			String password = "root";
			Connection con = DriverManager.getConnection(url, user, password);
			Statement s1 = con.createStatement();
			//String qur = "create table second(id integer primary key,name varchar(50) not null,email varchar(50) not null,contact int not null)";
			String fetch = "insert into second values(123456,'jeevan','email.com',787)";
			s1.execute(fetch);
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}	
		
		
	}
}
