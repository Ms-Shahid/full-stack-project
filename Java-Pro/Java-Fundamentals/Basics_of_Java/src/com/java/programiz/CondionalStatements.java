package com.java.programiz;

import java.util.Scanner;

public class CondionalStatements {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int input1 = scan.nextInt();
		int input2 = scan.nextInt();
		int input3 = scan.nextInt();
		
		if(input1<0)
			System.out.println("Number is negative");
		else if(input1 == 0)
			System.out.println("Number is zero");
		else
			System.out.println("Number is greater than zero");
		
		
		//program to find largest of 3 numbers
		

	}

}
