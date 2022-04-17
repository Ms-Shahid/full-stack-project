package com.inheritance.patent;

public class Vehicle {

	int cost =0;
	int milage = 0;
	
	public Vehicle(int cost, int milage) {
		this.cost = cost;
		this.milage = milage;
	}
	
	public void show_details() {
		System.out.println("The cost of vehicle is : " + cost);
		System.out.println("The milage of vehicle is : "+ milage);
	}
}
