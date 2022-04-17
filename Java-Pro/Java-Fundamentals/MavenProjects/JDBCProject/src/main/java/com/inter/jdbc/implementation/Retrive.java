package com.inter.jdbc.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.inter.jdbc.RetriveData;
import com.inter.util.DBConnection;

public class Retrive implements RetriveData {

	public void fetchDataFromDataBase() {

		String fetchData = "SELECT * FROM users ";

		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatemet = connection.prepareStatement(fetchData);) {

			ResultSet rs = preparedStatemet.executeQuery();
			while (rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String country = rs.getString("country");
				System.out.println(id + "," + name + "," + email + "," + country);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
