package java_core;

public class Constructor1 {

	public int seats;
	public String color;
	
	//Parameterised constructor-> same name as that of method name
	public Constructor1(String color, int seats) {
		this.color = color;
		this.seats = seats;
	}
	
	//Constructor with interchange of parameterised 
	public Constructor1(int seats,String color) {
		this.color = color;
		this.seats = seats;
	}
	
	// default Constructor 
	//we can do Constructor overloading
	public Constructor1() {
	}
	
	public void display() {
		System.out.println("Your car will be "+seats + " seats and "+ color + " color");
		return; //it does'nt give error 
	}
	//there are 3 types of methods: 1) without arguments, 2)return type, 3)with arguments
	public int add() {
		return 10;
	}
	public static void main(String[] args) {
		Constructor1 c1 = new Constructor1("Red", 4);
		Constructor1 c2 = new Constructor1("Yellow", 5);
		Constructor1 c3 = new Constructor1(); //constructor overloading
		Constructor1 c4 = new Constructor1(); //interchange of parameters
		c1.display();
		c2.display();
		c3.display();
		c4.display();
		
		int x = c4.add(); //x is a reference pointing to method add
		System.out.println(x); //gives the return  
	}
}


