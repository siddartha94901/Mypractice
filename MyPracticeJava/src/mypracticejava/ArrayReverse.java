package mypracticejava;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter n values");
		int n = input.nextInt();
		int[] a = new int[n];
		System.out.println("enter array elements");
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		System.out.println("Reverse elements are...........");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}

}
