package mypracticejava;

import java.util.Scanner;

public class TwoStringSame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter String-1");
		char[] a = input.next().toCharArray();
		System.out.println("enter String-2");
		char[] b = input.next().toCharArray();
		int count = 0;
		for (int i = 0, j = 0; i < a.length && j < b.length; i++, j++) {
			if (a[i] != b[j]) {
				count++;
			}
			System.out.println(a[i] + "==" + b[j]);
		}
		if (count == 0) {
			System.out.println(" Strings are same");
		} else {
			System.out.println("Strings are not same");
		}
	}
}
