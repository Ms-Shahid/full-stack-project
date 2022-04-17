package com.javaconcepts.generics;

public class GenericClass<G> {

	private G[] inputArray;   //inputArray of type generic
	
	public GenericClass(G[] inputArray) {
		this.inputArray = inputArray;
	}
	
	public void toPrint() {
		GenericClass.toPrint(this.inputArray);
	}

	public static <G> void toPrint(G[] inputArray) {
		for(G element : inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 1.2, 1.3, 1.4, 1.5};
		Character[] charArray = {'a', 'i', 'o', 'u', 'e'};
		
		new GenericClass(intArray).toPrint();
		GenericClass.toPrint(doubleArray);
		GenericClass.toPrint(charArray);
	}
}
