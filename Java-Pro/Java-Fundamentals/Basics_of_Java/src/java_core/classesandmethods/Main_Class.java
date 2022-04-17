package java_core.classesandmethods;

import java.util.Scanner;

public class Main_Class {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = scan.nextLine(); //string nextLine
		
		System.out.println("Enter your marks : ");
		int marks = scan.nextInt(); 
		scan.close();
		
		//creating object of student class
		
		Student obj = new Student(name, marks);
		
		//obj.get_details();
		obj.show_details();
	}
}
