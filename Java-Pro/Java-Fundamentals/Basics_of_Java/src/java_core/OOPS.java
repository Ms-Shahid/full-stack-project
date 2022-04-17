package java_core;

public class OOPS {

	int id;
	String name;
	private String collegeName;
	
	public OOPS() {
		//this is a default constructor 
	}
	
	public OOPS(int id, String name) {
		//this is parameterised constructor
		super();
		this.id = id;  //this represent the current object
		this.name = name;
	}
	public OOPS(int id, String name, String collegeName) {
		//this is parameterised constructor
		super();
		this.id = id;  //this represent the current object
		this.name = name;
		this.collegeName = collegeName;
	}
	public void display() {
		System.out.println("display method");
		System.out.println("Id: "+this.id+"Name: "+this.name);
	}
	
	@Override
	public String toString() {
		return "OOPS [id=" + id + ", name=" + name + ", collegeName=" + collegeName + "]";
	}

	public static void main(String[] args) {
		
		//object of OOPS class
		OOPS ops = new OOPS();
		ops.display();
		
		//creating the instance for parameterised constructor
		OOPS ops2 = new OOPS(1,"Rahul");
		OOPS ops3 = new OOPS(1,"New");
		OOPS ops4 = new OOPS(1,"ops4");
		System.out.println(ops.id);
		ops2.display();
		System.out.println(ops2.toString());
	}

}
