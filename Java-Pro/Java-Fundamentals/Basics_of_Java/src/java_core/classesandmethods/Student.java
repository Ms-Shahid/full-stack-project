package java_core.classesandmethods;

public class Student {

	//Scanner scan = new Scanner(System.in);
	String name="";
	int marks = 0;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	/*
	//method to take input from user
	public void get_details() {
		
		System.out.println("Enter your name : ");
		name = scan.nextLine(); //string nextLine
		
		System.out.println("Enter your marks : ");
		marks = scan.nextInt(); 
		scan.close();
	}
	*/
	 public void show_details() {
		System.out.println("Name of Student is : "+ name);
		System.out.println("Marks obtained by "+ name + " are : "+ marks);
	}
}
