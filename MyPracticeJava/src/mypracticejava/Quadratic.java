package mypracticejava;
import java.util.Scanner;
public class Quadratic {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	double r1,r2;
	System.out.println("enter values of a,b,c");
	 double a=input.nextDouble();
	 double b=input.nextDouble();
	 double c=input.nextDouble();
	 
	 double d=(b*b)-(4*a*c);
	 if(d==0) {
		 System.out.println("Roots are real and equal");
		 r1=r2=   (-b/(2*a));
		 System.out.println("r1="+r1);
		 System.out.println("r2="+r2);
	 }
	 if(d>0) {
		 System.out.println("roots are real and distinct");
		 r1=-b+Math.sqrt(d)/(2*a);
		 r2=-b-Math.sqrt(d)/(2*a);
		 System.out.println("r1="+r1);
		 System.out.println("r2="+r2);
	 }
		 else {
			 System.out.println("roots are real and distinct");
			 double x=-b/(2*a);
			 double y=Math.sqrt(-d)/(2*a);
	System.out.println("r1="+x+"+i"+y);
	System.out.println("r2="+x+"-i"+y);
	}
		 
	 
	}
	}


