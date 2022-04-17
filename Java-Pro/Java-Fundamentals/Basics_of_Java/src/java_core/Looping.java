package java_core;

public class Looping {

	public static void main(String[] args) {
		
		int num = 0,sum=0;
		while(num<=5) {
			System.out.println(num);
			num++;
			sum+=num;//1,3,5,9,14,21
		}
		System.out.println("Sum : "+sum);
		for(int i=0; i<=5; ++i) {
			System.out.println(i);
		}
		
		
	}

}
