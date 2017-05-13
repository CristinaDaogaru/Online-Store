package com.game.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.game.model.RegistrationModel;

public class DaoMVC {

	public static Connection connection() {

		Connection conn = null;

		String userName = "sa";
		String password = "calculatoare";

		String url = "jdbc:sqlserver://localhost:1433;databaseName=OnlineStore";

		try {

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url, userName, password);
			System.out.println("Connected");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return conn;
	}

	public static int registerUser(RegistrationModel registrModel, String sql) {

		int i = 0;
		Connection conn = connection();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, registrModel.getUsername());
			ps.setString(2, registrModel.getFname());
			ps.setString(3, registrModel.getLname());
			ps.setString(4, registrModel.getEmail());
			ps.setString(5, registrModel.getPassword());
			
			

			i = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

	
}
