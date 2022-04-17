package java_core;

import java.util.Scanner;

public class Conditional_Statements {

	public static void main(String[] args) {
		
		System.out.println("Enter Your marks");
		Scanner scan = new Scanner(System.in);
		int marks = scan.nextInt();
		
		if (marks<50) {
			System.out.println("fail");
		}else if (marks>=50 && marks<60){
			System.out.println("grade D");
		}else if (marks>=60 && marks<75) {
			System.out.println("grade C");
		}else if (marks>=75 && marks<90) {
			System.out.println("grade B");
		}else if (marks>=90 && marks<100) 
			System.out.println("grade A");
		else {
			System.out.println("Invalid Score");
		}
		scan.close();
		
	}

}
