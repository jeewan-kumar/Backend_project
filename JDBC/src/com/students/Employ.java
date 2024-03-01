package com.students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employ {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/student";
			String user = "postgres";
			String password = "root";
			Connection emp = DriverManager.getConnection(url, user, password);
			Statement s = emp.createStatement();
			//String que = "create table third(eid integer primary key,ename varchar(50) not null,econtact integer not null,eemail varchar(50) not null)";
			String fetch = "insert into third values(12,'jeevan',78,'email.com')";
			s.execute(fetch);
			emp.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

