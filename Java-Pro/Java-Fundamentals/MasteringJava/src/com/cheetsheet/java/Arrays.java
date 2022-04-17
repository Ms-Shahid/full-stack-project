package com.cheetsheet.java;

public class Arrays {

	public static void main(String[] args) {
		
		//syntax : data_type var_name = new data_type[size]
		//Creating an Array
		int[] numbers = new int[3];		//single-D array
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		//printing the elements of array
		for(int i = 0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		//shortcut declaration and initialisation
		int[] number = {1,3,9,4,12,5}; 
		int j = 0;
		while(j<number.length) {
			System.out.println(number[j]);
			j++;
		}
		
		//Name array to store names of students
		String[] names = {"Mike","Sam","Leo","arjun","Perry","Nikki"};
		System.out.println(names);
		names[0] = "Tom";
		System.out.println(names[1]);
		System.out.println(names.length);
		//for-each loop
		for(String i: names) {
			System.out.println(i);
			
		}
		
		//Multi-D array
		int[][] matrix = new int[3][2];
		matrix[0][0] = 10;
		matrix[0][1] = 20;
		matrix[1][0] = 30;
		matrix[1][1] = 40;
		matrix[2][0] = 50;
		matrix[2][1] = 60;
		for(int i = 0; i< matrix.length; i++) {
			for(int j1 = 0; j1 < matrix[i].length; j1++) {
				System.out.println(matrix[i][j1]);
			}
		}
		
		//creating 2D array with shortcut
		
		int[][] array = {
				{1,2,3},
				{-1,10,20,25},
				{100},
		};
		
		for(int[] innerArray : array) {
			for(int data : innerArray) {
				System.out.println("Matrix : " + data);
			}
		}
		
		//Create and initiliaze 3D array
		int[][][] dimensional3D = {
				{
					{5,10,15},
					{15,25,35} 		//2D array with 3X3
				},
				{
					{1,3,5,7},
					{0},
					{2,4,6}			//1D array with 4X3
				}
		};
		
		for(int[][] array2D : dimensional3D) {
			for(int[] array1D : array2D) {
				for(int value : array1D) {
					System.out.println(value);
				}
			}
		}
	}
}
