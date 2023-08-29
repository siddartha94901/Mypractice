package mypracticejava;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter n values");
		int n = input.nextInt();
		int i, j;
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}
}
