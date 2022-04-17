package com.cheetsheet.java;

public class StringMethods {

	public static void main(String[] args) {
		String sentence = "Welcome to Java, a official programming language";
		
		boolean M1 = sentence.startsWith("a");
		boolean M2 = sentence.endsWith("e");
		int M3 = sentence.length();
		int M4 = sentence.indexOf("o");
		String M5 = sentence.replace("W", "X");
		String M6 = sentence.toUpperCase();
		String M7 = sentence.toLowerCase();
		
		System.out.println(M1);
		System.out.println(M2);
		System.out.println(M3);
		System.out.println(M4);
		System.out.println(M5);
		System.out.println(M6);
		System.out.println(M7);
		
	}
}
