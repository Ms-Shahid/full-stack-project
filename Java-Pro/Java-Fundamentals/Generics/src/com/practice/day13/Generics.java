package com.practice.day13;

public class Generics<G> {

	G x, y, z;
	public Generics(G x, G y, G z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	public static <G extends Comparable<G>> G maximum(G x,G y, G z){
		G max = x;
		if(y.compareTo(max) > 0) 
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}
	
	public static String testMaximum(String x, String y, String z) {
		String max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}
	public static void main(String[] args) {
		System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
	}
	
	
}
