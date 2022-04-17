package com.bridgelabz.bl;

import com.inter.jdbc.implementation.CreateTable;
import com.inter.jdbc.implementation.DeleteRecords;
import com.inter.jdbc.implementation.InsertRecords;
import com.inter.jdbc.implementation.Retrive;
import com.inter.jdbc.implementation.UpdateRecords;

public abstract class Main {

	public static void main(String[] args) {

		CreateTable createTable = new CreateTable();
		InsertRecords insertRecords = new InsertRecords();
		UpdateRecords updateRecords = new UpdateRecords();
		Retrive retrive = new Retrive();
		DeleteRecords record = new DeleteRecords();

		createTable.createTable();
		insertRecords.insertRecords();
		retrive.fetchDataFromDataBase();
		updateRecords.updateDataBase();
		retrive.fetchDataFromDataBase();
		record.deleteRecords();
		retrive.fetchDataFromDataBase();
	}
}
