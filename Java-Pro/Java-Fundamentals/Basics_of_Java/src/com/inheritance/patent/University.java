package com.inheritance.patent;

public class University {

	//a parent class
	
	public String name;
	public int USN;
	public String department;
	
	public University(String name, int USN, String department) {
		this.name=name;
		this.USN=USN;
		this.department=department;
	}
	
	public void show_details() {
		System.out.println("Name of student is : "+name + "\n bearing with USN "+USN + "\n from the department"+ department);
	}

	
}
