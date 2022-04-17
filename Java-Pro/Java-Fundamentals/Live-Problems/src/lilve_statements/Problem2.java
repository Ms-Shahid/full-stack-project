package lilve_statements;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 2. Leap Year
	a. I/P -> Year, ensure it is a 4 digit number.
	b. Logic -> Determine if it is a Leap Year.
	c. O/P -> Print the year is a Leap Year or not.
		 */
		System.out.println("Enter the Year : ");

		Scanner yr = new Scanner(System.in);
		int year = yr.nextInt();
		
		if ( (year%4) == 0 || (year % 400 == 0) ) {
			
			System.out.println(year + " is a leap year");
		}
		else if( (year % 100) == 0) {
			System.out.println(year + " is a not leap year");

		}
		else {
			System.out.println(year + " is a not leap year");

		}
		yr.close();
		
	}

}
