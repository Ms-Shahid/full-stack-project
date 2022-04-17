package com.inheritance.main;

import java.util.Scanner;

import com.inheritance.child.Car_BMW;

public class Vehicle_Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the cost of Car : ");
		int vehicle_cost = scan.nextInt();
		
		System.out.println("Enter the milege of Car : ");
		int milege = scan.nextInt();
		
		System.out.println("Enter the color of Car : ");
		String color = scan.next();
		
		System.out.println("Enter number of tyers of Car : ");
		int tyres = scan.nextInt();
		
		scan.close();
		//calling the constructor 
		Car_BMW obj = new Car_BMW(vehicle_cost,milege,color,tyres);
		
		obj.show_car_details();
		obj.show_details();
		
	}

}
