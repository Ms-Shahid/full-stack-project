package java_core;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		int x=20, y = 10;
		float r = 4.5f;
		
		MethodOverLoading obj = new MethodOverLoading();
		int sq_area = obj.area(x,y);
		float circle_area = obj.area(r);
		System.out.println("Area of square is : "+sq_area);
		System.out.println("Area of circle is : "+circle_area);
		
	}
	
	//method overloading 
	public int area(int a, int b) {
		//area of the square
		int result = a*b;
		return result;
	}
	
	public float area(float r) {
		//area of circle
		float result = 3.14f*r*r;
		return result;
	}
}


