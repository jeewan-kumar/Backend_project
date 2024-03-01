package com.students;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class StudentInsert {
	public static void main(String[] args) {
		try {
			System.out.println("ki");
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/student";
			String user = "postgres";
			String password = "root";
		
			Properties properties = new Properties();
			File file = new File("a.properties");
			FileInputStream fileInputStream = new FileInputStream(file);
			properties.load(fileInputStream);
			Connection connection = DriverManager.getConnection(url, properties);
//			Connection emp = DriverManager.getConnection(url, user, password);
//			Statement s = emp.createStatement();
//			String featch = "insert into student values(2,'jeewan',7870794231,'jeevan@123')";
//			s.execute(featch);
			String featch = "insert into student values(?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(featch);
			preparedStatement.setInt(1, 4);
			preparedStatement.setString(2, "raq");
			preparedStatement.setLong(3, 7870794234l);
			preparedStatement.setString(4, "jee@gmail.com");
	
			preparedStatement.execute();
			System.out.println("Record inserted successfully");
			//emp.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		 catch (FileNotFoundException e) {
//			// TODO: handle exception
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}
