package com.java.programiz;

public class JavaLiterals {

	public static void main(String[] args) {
		
		/** Literals are the data used for representing fixed values
		 * they can be directly used in code..*/
		int a =1;
		float b = 12.5f;
		char c = 'A';
		
		System.out.println("Integer Literal value " + a);
		System.out.println("Floating Literal value " + b);
		System.out.println("Character Literal value " + c);
		
		//Boolean literals
		boolean flags1 = true;
		boolean flags2 = false;
		System.out.println("Boolean literal value " + flags1);
		
		//integer literals
		
		int binaryNumber = 0b100101;
		int octalNumber = 027;
		int decNumber = 27;
		int hexNumber = 0x27;

		System.out.println("Binary value " + binaryNumber);
		System.out.println("octal value " + octalNumber);
		System.out.println("decimal value " + decNumber);
		System.out.println("hexadecimal value " + hexNumber);
		
		//floating point literals
		
		double myDouble = 3.45;
		float myFloat = 7.89f;
		double myDoubleScientific = 3.14e2; //scientific literal
		
		System.out.println("Double value " + myDouble);
		System.out.println("Float value " + myFloat);
		System.out.println("Scientific Double value " + myDoubleScientific);
		
		//character literal
		char letter = 'A';
		System.out.println("Character literal value " + letter);
		
		//String literal
		String s1 = "Java";
		String s2 = "Programming";
		System.out.println("String literal value: " + s1 + s2);
		System.out.println("String literal value: " + s1 + "\t" +s2);
		System.out.println("String literal value: " + s1 + "\b" + s2);
		System.out.println("String literal value: " + s1 + "\n" +s2);

	}
}
