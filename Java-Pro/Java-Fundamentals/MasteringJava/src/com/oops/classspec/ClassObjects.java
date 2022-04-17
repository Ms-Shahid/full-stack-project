package com.oops.classspec;

public class ClassObjects {

	private final double rx, ry;
	private final double q;
	
	public ClassObjects(double x0, double y0, double q0) {
		rx = x0; ry = y0; q = q0;	
	}
	
	public double potentialAt(double x, double y) {
		double k = 8.99e09;
		double dx = x - rx;
		double dy = y - ry;
		return k*q / Math.sqrt(dx * dx + dy * dy);
	}
	
	
	@Override
	public String toString() {
		return "ClassObjects [rx=" + rx + ", ry=" + ry + ", q=" + q + "]";
	}

	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		ClassObjects c1 = new ClassObjects(0.51, 0.63, 21.3);
		ClassObjects c2 = new ClassObjects(0.13, 0.94, 81.9);
		double v1 = c1.potentialAt(x, y);
		double v2 = c2.potentialAt(x, y);
		System.out.printf("%.2e\n", (v1+v2));
	}
}
