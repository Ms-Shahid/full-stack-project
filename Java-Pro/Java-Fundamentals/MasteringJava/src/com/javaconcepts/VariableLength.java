package com.javaconcepts;

public class VariableLength {

	public static void VariableLengthofArguments(int... numbers) {
		
		int sum = 0;
		for(int value: numbers) {
			sum += value;
		}
		System.out.println("Sum of numbers are: "+sum);
	}

	public static void main(String[] args) {
		
		VariableLengthofArguments(1,2);
		VariableLengthofArguments(1,5,9);
		VariableLengthofArguments(-1,4,8,5);
	}
}
