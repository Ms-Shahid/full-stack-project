package com.inter.jdbc.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.inter.jdbc.UpdateTable;
import com.inter.util.DBConnection;

public class UpdateRecords implements UpdateTable {

	public void updateDataBase() {
		String UPDATE_DATA = "update users set name = ? where id = ?;";
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_DATA);) {

			preparedStatement.setString(1, "Captain");
			preparedStatement.setInt(2, 1);
			preparedStatement.executeUpdate();
			System.out.println(preparedStatement);
		} catch (Exception e) {

		}
	}
}
