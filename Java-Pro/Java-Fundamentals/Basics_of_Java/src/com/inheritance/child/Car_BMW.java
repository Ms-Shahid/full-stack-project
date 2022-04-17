package com.inheritance.child;

import com.inheritance.patent.Vehicle;

public class Car_BMW extends Vehicle {

	String color;
	int tyers;
	public Car_BMW(int cost, int milage,String color, int tyers) {
		super(cost, milage); //with this i can pass the values of parent class to child class
		this.color = color;
		this.tyers = tyers;
	}

	public void show_car_details() {
		
		System.out.println("The color of the car is : "+color);
		System.out.println("The no of tyres are : " +tyers);
	}
	
}
