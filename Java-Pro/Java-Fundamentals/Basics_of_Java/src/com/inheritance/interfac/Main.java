package com.inheritance.interfac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String my_name = scan.next();
		
		System.out.println("Enter yearofServices: ");
		int org = scan.nextInt();
		
		System.out.println("Enter salary: ");
		int my_salary = scan.nextInt();
		
		scan.close();
		Person p = new Person(my_name, org,my_salary);
		
		p.taks();
		p.show_details();
		
	}
}
