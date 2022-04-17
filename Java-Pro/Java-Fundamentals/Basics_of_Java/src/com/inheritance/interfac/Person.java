package com.inheritance.interfac;

public class Person extends Company implements Work{

	int salary=0;
	public Person(String name,int yearofServices,int salary) {
		super(name,yearofServices);
		this.salary = salary;
	}
	
	public void taks() {
		System.out.println("Earn money");
	}

}
