package com.bridgelabz.Functional_Programs;

import java.util.Scanner;

public class Triplets {
	static void findTriplets(int[] arr, int n) {
		boolean found = true;
		int count = 0;
		System.out.println("Triplet formed:");
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.print(arr[i]);
						System.out.print(" ");
						System.out.print(arr[j]);
						System.out.print(" ");
						System.out.print(arr[k]);
						System.out.print(" ");
						found = true;
						count++;
						System.out.println();
					}
				}
			}
		}
		System.out.println("Total triplets:" + count);

		if (found == false)
			System.out.println(" not exist ");

	}

	public static void main(String[] args) {
		int len;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array length : ");
		len = sc.nextInt();
		int arr[] = new int[len];// declaration
		System.out.print("Enter " + len + " Element to Store in Array :\n");
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Elements in Array are :\n");
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println(" ");
		findTriplets(arr, len);
	}
}



