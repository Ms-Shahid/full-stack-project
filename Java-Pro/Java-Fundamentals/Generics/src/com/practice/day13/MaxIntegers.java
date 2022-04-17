package com.practice.day13;

public class MaxIntegers {

	public static Integer toPrint(Integer x, Integer y , Integer z) {
		
		Integer max = x;
		if( y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}
	
	public static void main(String[] args) {
		
		MaxIntegers.toPrint(2, 3, 5);
		
	}
}
