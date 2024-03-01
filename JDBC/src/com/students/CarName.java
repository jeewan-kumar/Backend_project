package com.students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CarName {
public static void main(String[] args) {
	try {
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5432/student";
		String user = "postgres";
		String password = "root";
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		String create = "create table carname(id serial primary key, model varchar(50) not null,year integer)";
		statement.execute(create);
		System.out.println("create table sucessfully");
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
