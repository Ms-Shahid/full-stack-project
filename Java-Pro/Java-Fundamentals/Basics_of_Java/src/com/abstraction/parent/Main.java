package com.abstraction.parent;

/*Abstract class help us to hide the some of the features from the main class
 * if the class or method is defined with abstract keyword then we cannot create the objects of that class and also 
 * the method is not access-able, And also the Abstract method not have a body, not even a curly-braces 
 * if we want to access the methods of the abstract class, then we must inherit the abstract-class to some child-class 
 * and there we can create objects of this child class and extract the methods through objects*/

public class Main {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.behaviour();
		
		Dog d = new Dog();
		d.behaviour();
		
	}
	
}

/*An interface is a completely abstract class that is used to group related methods with empty bodies
 * the difference between the interface and abstract is that,abstract class can have abstract methods or normal methods 
 * But in interface, all of the methods of the interface class must be abstract only.
 * All of the methods must be over-written by the class */
