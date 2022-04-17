package java_core;

public class Arrays {

	public static void main(String[] args) {

		/*
		char [] ch = new char[5];
		
		ch[0] = 'a';
		ch[1] = 'i';
		ch[2] = 'e';
		ch[3] = 'o';
		ch[4] = 'u';
		
		for(int i=0; i<5; i++) {
			System.out.println(ch[i]);
		}
		
		int [] x = new int[10];
		
		//create an array of 10 elements
		for(int i=0;i<10;i++) {
			x[i] = i;
		}
		//to print on to the console
		for (int j=0; j<10;j++) {
			System.out.println(x[j]);
		}
		*/
		
		//sum of array's
		//Initialisation 
		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[5];
		int num =5;
		
		for(int i=0; i<5;i++) {
			a[i] = i;
		}
		//start from 6
		for(int i=0; i<5; i++) {
			b[i] = num;
			++num;
		}
		System.out.print("values of array A : ");
		for(int i=0; i<5; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\nvalues of array B : ");
		for(int i=0; i<5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("\nSum of array : ");
		for(int i=0; i<5; i++) {
			c[i] = a[i] + b[i];
		}
		for(int i=0; i<5; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
