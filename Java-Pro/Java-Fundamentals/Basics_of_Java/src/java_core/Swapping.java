package java_core;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
		//invoking the static method
		System.out.print("Enter the first number : ");
		Scanner x = new Scanner(System.in);
		int num1 = x.nextInt();
		
		System.out.print("Enter the second number : ");
		Scanner y = new Scanner(System.in);
		int num2 = y.nextInt();
		swap(num1,num2);

	}
	
	public static void swap(int a, int b) {
		System.out.println("Before Swapping :" + a + "," + b);
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping :" + a + "," + b);
	}

}
