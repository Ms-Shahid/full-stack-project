package com.controller;

import java.util.Scanner;

public class Tracker {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your buying price per share: ");
		double buyingPrice = input.nextDouble();
		int day = 1;
		double closingPrice;
		double[] weekly = new double[7];
	
		int i = 0;
		while ( i < weekly.length) {
			System.out.println("Enter the closing price for the day " + day);
			closingPrice = input.nextDouble();
			double earnings = closingPrice - buyingPrice;
			weekly[i] = earnings;
			
			if(earnings > 0 ) {
				System.out.printf("After day " + day + " you have gained $%.2f" + "per share since yesterday.",earnings);
			}else if ( earnings < 0 ) {
				System.out.printf("After day " + day + "you have lost $.2f" + "per share since yesterday",(-earnings));
			}else {
				System.out.println("After day "+ day + "you have no earnings per share");
			}
			day += 1;
			i += 1;
		}
			
		System.out.println("Your weekly earnings:");
		double totalWeeklyEarnings = 0;
		for(int j = 0; j < weekly.length; j++) {
			System.out.printf("Your earnings on day" + j + " is $%.2f",weekly[j]);
			System.out.println();
			totalWeeklyEarnings += weekly[j];
		}
		System.out.printf("Total earnings:" + "$%.2f" + "per share", totalWeeklyEarnings);
		input.close();
	}
	
}
