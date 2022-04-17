package java_core;

import java.util.Scanner;

public class PattrenLooping {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to print pattern : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		// i = 0,1,2,4,
		// j = 0 ,0,1 ,0,1,2 ,0,1,2,3 ,0,1,2,3,4
		//outer loop -> no of rows
		for(int i=0; i<n;i++) {
			
			//inner loop -> no of columns
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
