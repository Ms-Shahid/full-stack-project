package com.inheritance.child;

class Parent{
	
	public void m1() {
	System.out.println("Parent class method 1");
	}
	public void m3() {
		System.out.println("Parent class method 3");
		}
}

class Child extends Parent{
	
	public void m2() {
		super.m1();
		System.out.println("Child class method 2\n");
		}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		Child child = new Child();
		Parent parent = new Parent();
		parent.m1();
		//parent.m2();
		child.m1();
		child.m2();
		child.m3();
	}
}

