package com.javaconcepts.generics;

public class GenericMethod {

	public static <E> void toPrint(E[] inputArray) {
		for(E element : inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,1.2,1.3,1.4,1.5};
		Character[] charArray = {'a','i','e','o','u'};
		
		GenericMethod.toPrint(intArray);
		GenericMethod.toPrint(doubleArray);
		GenericMethod.toPrint(charArray);
	}
}
