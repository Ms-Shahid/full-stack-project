package com.oops.aggregation;

public class Employee {

	int id;
	String name;
	Address address;
	
	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display() {
		System.out.println("Employee id: " + id + " " + "Employee name: " +name);
		System.out.println("Address: " + address.city + " " + address.state + " " + address.country);
	}
	
	public static void main(String[] args) {
		
		Address address1 = new Address("Bangalore","Karnataka","India");
		Address address2 = new Address("Pune","Maharastra", "India");
		
		Employee emp1 = new Employee(123, "Rahul", address1);
		Employee emp2 = new Employee(456,"Zaid",address2);
		
		emp1.display();
		emp2.display();
	}
}
