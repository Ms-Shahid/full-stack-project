package com.basics.variables;

class Local{
	
	public void num() {
		//local variable, scope is within this method num
				int number = 50;
				System.out.println(number);
	}
}
public class ScopeofVariable {

	String data; //instance variable, outside the method, but within the class
	static int var; //declaring the static variable
	
	public static void main(String[] args) {
		
		ScopeofVariable scope = new ScopeofVariable();
		Local name = new Local();
		
		//accessing the local variable
		name.num();
		//Local.num(); static method
		
		//accessing the instance variable
		scope.data="";
		
		//accessing the static variable
		ScopeofVariable.var=10;
	}
}
