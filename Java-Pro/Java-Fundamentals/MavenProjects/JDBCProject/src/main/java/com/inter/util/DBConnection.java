package com.inter.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static String url = "jdbc:mysql://localhost:3306/userinfo";
	public static String uname = "root";
	public static String pass = "Shahid24@Atif06";

	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, uname, pass);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("Connection got established");
		return connection;
	}
}
