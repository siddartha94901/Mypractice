package mypracticejava;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the values of r");
		int r = input.nextInt();
		System.out.println("enter the values of c");
		int c = input.nextInt();
		int[][] a = new int[r][c];
		int[][] b = new int[r][c];
		int[][] d = new int[r][c];
		int i, j;
		System.out.println("enter values for 1st matrix");
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				a[i][j] = input.nextInt();
			}
		}
		System.out.println("enter the values of 2nd matrix");
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				b[i][j] = input.nextInt();
			}
		}
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				d[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("matrix addition is:");
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
	}
}
