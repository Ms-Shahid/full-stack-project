package com.java.programiz;

import java.util.Scanner;

public class OutputAndInput {

	public static void main(String[] args) {
		//Java Basic Input and Output
		
		/*..
		 * Difference between println(), print() and printf()
		print() - It prints string inside the quotes.
		
		println() - It prints string inside the quotes similar like print() method. 
					Then the cursor moves to the beginning of the next line.
					
		printf() - It provides string formatting (similar to printf in C/C++ programming).*/
		
		System.out.println("1. println ");
        System.out.println("2. println ");
    	
        System.out.print("1. print ");
        System.out.print("2. print");
        
        //String concatenation
        Double number = -10.6;
    	
        System.out.println("I am " + "awesome.");
        System.out.println("Number = " + number);
        
        //Java Input
        //first import Scanner class: Syntax: import java.util.Scanner;
        // create an object of Scanner
        Scanner input = new Scanner(System.in);

        // take input from the user
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        System.out.println("You entered " + num);
        
        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);
    	
        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);
    	
        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);

        input.close();   
	}
}
