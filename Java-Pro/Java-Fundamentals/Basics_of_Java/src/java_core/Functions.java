package java_core;

public class Functions {

	public static void main(String[] args) {
	
		//invoke the static method
		add();
		sub(10,5);
		
		//invoking the non-static methods
		Functions fun = new Functions(); //creating the object fun of class Functions
		int x = 10;
		int y = 15;
		int get_result = fun.mul(x,y);
		
		System.out.println(get_result);

	}
	
	//user defined function, outside main function
	/*
	 * public is an access modifier which tells about the accessibility of method
	 * static is a keyword which tells the java complier to invoke the function/method without 
	 * creating an object of class to invoke the function/method */
	public static void add() {
		System.out.println("adding...");
	}

	public static void sub(int a, int b) {
		System.out.println("substracting ....");
		System.out.println(a-b);
	}
	
	//functions with return type
	
	public int mul(int a, int b) {
		int result = a*b;
		return result;
	}
	
}
