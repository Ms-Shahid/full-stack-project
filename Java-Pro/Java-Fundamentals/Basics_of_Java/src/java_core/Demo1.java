package java_core;

public class Demo1 {

	
	int x; //instance variable can be assessed by using class-object
	
	static int y = 3; //class-variable-> which has some property
	
	//default constructor
	public Demo1() {
		
		x = 5;
		y++;
	}
	public static void main(String[] args) {
		int x=50; //local variable
		
		Demo1 demo = new Demo1(); //y =4
		Demo1 demo1 = new Demo1(); //y=5
		
		System.out.println("Local Variable directly "+x);
		System.out.println("instance Variable using class-object "+demo.x);
		System.out.println(demo1.y);
		
		//Java Left Shift Operator Example
		System.out.println(10<<2); //10*2^2=10*4=40;
		System.out.println(10>>2); //10/2^2=10/4=2;
		
		//Ternary operator
		int a =10, b = 30;
		String message = a>b ? "A is greater":"B is greater";
		System.out.println(message);
		
		//for loop
		int sum =0;
		for(int i=0;i<5;i++) {
			sum = sum + i;
			//sum +=i;
		}
		System.out.println(sum);
	
		//Array's
		int arr[] = {1,2,3,4,5}; //Method-1
		
		int arr1[] = new int[5]; //Method-2
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		System.out.println(arr.length);
		System.out.println(arr);
		
		for(int i=0; i<5;i++) {
			System.out.println(arr1[i]);
		}
		
		//2D-array
		int Array2D[][] ={
			{1,2,3},
			{1,2,4},
			{1,5,6}
		};
		
		for(int i=0;i<Array2D.length;i++) {
			for(int j=0;j<Array2D.length;j++) {
				System.out.println(" " + Array2D[i][j]);
				
			}
		}
		
		int row =3;
		int col =3;
		int Array_2D[][] = new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				Array_2D[i][j] = i+j;
			}	
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println(" "+Array_2D[i][j]);
			}
			System.out.println();
		}	
	}
	

}
