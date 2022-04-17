package com.inheritance.interfac;

public class Company {

	String name= "";
	int yearofServices=0;
	
	public Company(String name,int yearofServices) {
		this.name = name;
		this.yearofServices = yearofServices;
	}
	
	public void show_details() {
		System.out.println("The name of the company is "+name);
		System.out.println("The year of service provided by "+name+" are "+yearofServices);
	}
	
}
