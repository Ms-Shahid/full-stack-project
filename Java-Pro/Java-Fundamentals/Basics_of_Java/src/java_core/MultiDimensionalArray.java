package java_core;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		int a[][] = new int[3][3]; //3x3 matrix
		int num = 0;
		
		//adding elements to matrix
		for(int i=0; i<3;i++) {
			
			for(int j=0;j<3;j++) {
				a[i][j] = num;
				++num;
			}
		}
		
		//to print out the values of array
		for(int i=0; i<3;i++) {
			
			for(int j=0;i<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
