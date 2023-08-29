package mypracticejava;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter r values");
		float r = input.nextFloat();
		System.out.println("area of a circle is =" + (r = r * r * 3.142f));
	}
}
