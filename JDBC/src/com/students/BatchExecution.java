package com.students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExecution {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/student";
			String user = "postgres";
			String password = "root";
			Connection connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			connection.setAutoCommit(false);
			statement.addBatch("insert into student values(6,'jeewan',7870794231,'jeevan@123')");
			statement.addBatch("insert into student values(7,'jeewan',7870794231,'jeevan@123')");
			statement.addBatch("insert into student values(8,'jeewan',7870794231,'jeevan@123')");
			statement.addBatch("insert into student values(9,'jeewan',7870794231,'jeevan@123')");
			
			statement.addBatch("update student set name='X'");
			int[] res = statement.executeBatch();
			for(int i:res) {
				System.out.println(i);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
			connection.close();
			System.out.println(connection.isClosed());
			} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	}
}
