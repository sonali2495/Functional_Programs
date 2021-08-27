package com.bridgelabz.Functional_Programs;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x and y to calculate Euclidean distance : ");
		double x = sc.nextInt();
		double y = sc.nextInt();
		final double p = 2;
		double x1 = Math.pow(x, p);
		double y1 = Math.pow(y, p);
		System.out.println("x1 and y1 are: " + x1 + " and " + y1);
		double d = x1 + y1;
		double edistance = Math.sqrt(d);
		System.out.println("Eculidean distance is: " + edistance);

	}

}
