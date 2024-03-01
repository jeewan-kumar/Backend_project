package com.students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/student";
			String user = "postgres";
			String password = "root";
			Connection emp = DriverManager.getConnection(url, user, password);
			Statement s = emp.createStatement();
			String qur = "create table second(id integer primary key,name varchar(50) not null,email varchar(50) not null,phone bigint not null,qulafication integer not null, age intetger not null, exprence integer)";
			s.execute(qur);
			emp.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

