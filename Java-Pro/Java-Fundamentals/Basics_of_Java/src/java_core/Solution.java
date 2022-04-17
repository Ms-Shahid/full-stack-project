package java_core;
import java.util.Scanner;

class Solution {

	public static void main(String args[]) {

		// Write code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary : ");
		int b = sc.nextInt();
		System.out.println("Enter char: ");
		char c = sc.next().charAt(0);
		Solution.totalSalary(b, c);
	}

	public static void totalSalary(int basic, char ch) {
		float hra = (float)(basic * 20) / 100;
		double da = (float)(basic * 50) / 100;
		double pf = (float)(basic * 11) / 100;
		int allow;
		switch (ch) {
		case 'A':
			allow = 1700;
			break;
		case 'B':
			allow = 1500;
			break;
		default:
			allow = 1300;
			break;
		}
		
		double totalSalary = ((basic + hra + da + allow) - pf);
		System.out.println(Math.round(totalSalary));
	}
}
