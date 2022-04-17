package com.pounds;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.print("Enter elements =>");
		for(int i=0; i < 10; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("Integer in Reverse order =>");
		for(int i=9; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		scan.close();
	}
}
