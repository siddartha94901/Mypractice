package mypracticejava;

import java.util.Scanner;

public class CharecterPresent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String");
		char[] a = input.next().toCharArray();
		System.out.println("enter search character");
		char b = input.next().charAt(0);
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("character is not Present");
		} else
			System.out.println("Character is present:\n Total Occurance is" + count);
	}
}
