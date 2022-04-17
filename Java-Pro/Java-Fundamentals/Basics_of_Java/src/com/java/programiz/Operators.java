package com.java.programiz;

public class Operators {

	public static void main(String[] args) {
		
		//Relational Operators
		 // create variables
	    int a = 7, b = 11;

	    // value of a and b
	    System.out.println("a is " + a + " and b is " + b);

	    // == operator
	    System.out.println(a == b);  // false

	    // != operator
	    System.out.println(a != b);  // true

	    // > operator
	    System.out.println(a > b);  // false

	    // < operator
	    System.out.println(a < b);  // true

	    // >= operator
	    System.out.println(a >= b);  // false

	    // <= operator
	    System.out.println(a <= b);  // true
	    
	    //Logical Operators
	    
	    // && operator
	    System.out.println((5 > 3) && (8 > 5));  // true
	    System.out.println((5 > 3) && (8 < 5));  // false

	    // || operator
	    System.out.println((5 < 3) || (8 > 5));  // true
	    System.out.println((5 > 3) || (8 < 5));  // true
	    System.out.println((5 < 3) || (8 < 5));  // false

	    // ! operator
	    System.out.println(!(5 == 3));  // true
	    System.out.println(!(5 > 3));  // false
	    
	    //Increment and Decrement Operators
	    // declare variables
	    int a1 = 12, b1 = 12;
	    int result1, result2;

	    // original value
	    System.out.println("Value of a: " + a1);

	    // increment operator
	    result1 = ++a1;
	    System.out.println("After increment: " + result1+" a is: "+a1);

	    System.out.println("Value of b: " + b1);

	    // decrement operator
	    result2 = --b1;
	    System.out.println("After decrement: " + result2 + " b is: "+b1);
	    
	    int result3, result4;
	    System.out.println("Value of a: "+a1);
	    result3 = a1++;
	    System.out.println("After increment: " + result3+" a is: "+a1);
	    
	    result4 = b1--;
	    System.out.println("After increment: " + result4+" b is: "+b1);
	    
	    //other operators in java
	    
	    /*..Java instanceof Operator
		The instanceof operator checks whether an object is an instanceof a particular class. 
		For example,*/
	    String str = "Programiz";
	    boolean result;

	    // checks if str is an instance of
	    // the String class
	    result = str instanceof String;
	    System.out.println("Is str an object of String? " + result);
	    
	    /*..Java Ternary Operator
	     * The ternary operator (conditional operator) is shorthand for the if-then-else statement. 
	     * For example,
	     * Syntax : variable = Expression ? expression1 : expression2*/
	    
	    int februaryDays = 29;
	    String res;

	    // ternary operator
	    res = (februaryDays == 28) ? "Not a leap year" : "Leap year";
	    System.out.println(res);
	    
	}

}
