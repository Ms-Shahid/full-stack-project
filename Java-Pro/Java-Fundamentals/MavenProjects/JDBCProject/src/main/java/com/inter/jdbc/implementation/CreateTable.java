package com.inter.jdbc.implementation;

import java.sql.Connection;
import java.sql.Statement;

import com.inter.jdbc.DataBaseTable;
import com.inter.util.DBConnection;

public class CreateTable implements DataBaseTable {

	public void createTable() {
		String createTableSQL = "create table users (id int(3), name varchar(20), email varchar(20),country varchar(20))";
		try (Connection connection = DBConnection.getConnection();
				Statement statement = connection.createStatement();) {
			statement.execute(createTableSQL);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
