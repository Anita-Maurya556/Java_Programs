package java_programms;

import java.util.Scanner;

public class Circumference_OfCircle {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of pi");
		double pi= s1.nextDouble();
		System.out.println("Enter the value of radius");
		double r=s1.nextDouble();
		
		double circumference= 2*pi*r;
		System.out.println(circumference);

	}

}
