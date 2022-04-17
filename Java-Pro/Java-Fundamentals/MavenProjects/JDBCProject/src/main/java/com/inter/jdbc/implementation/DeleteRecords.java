package com.inter.jdbc.implementation;

import java.sql.Connection;
import java.sql.Statement;

import com.inter.jdbc.DeleteRecord;
import com.inter.util.DBConnection;

public class DeleteRecords implements DeleteRecord {

	public void deleteRecords() {

		String deleteQuery = "DELETE FROM users where id=3;";
		try (Connection connection = DBConnection.getConnection();
				Statement statement = connection.createStatement();) {

			int result = statement.executeUpdate(deleteQuery);
			System.out.println("Number of records affected :: " + result);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void deleteRecord() {
		// TODO Auto-generated method stub

	}
}
