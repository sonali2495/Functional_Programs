package com.bridgelabz.Functional_Programs;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a,b and c to find the roots of quadratic equation : ");
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double delta = b * b - 4 * a * c;
		System.out.println("Delta is:" + delta);
		double root1 = (-b + Math.sqrt(delta)) / (2 * a);
		double root2 = (-b + Math.sqrt(delta)) / (2 * a);
		System.out.println("Root 1 and Root 2 of the equaton " + a + "*x*x +  " + b + "*x + " + c + " are " + root1
				+ " and " + root2);

	}

}
