package com.inter.jdbc.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.inter.jdbc.InsertData;
import com.inter.util.DBConnection;

public class InsertRecords implements InsertData {

	public void insertRecords() {
		String INSERT_USER_SQL = "INSERT INTO users " + " (id, name, email, country) VALUES " + " (?, ?, ?, ?);";

		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL)) {

			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, "Tony");
			preparedStatement.setString(3, "tony123@gmail.com");
			preparedStatement.setString(4, "US");

			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
