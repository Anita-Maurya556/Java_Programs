package java_programms;

import java.util.Scanner;

public class AreaOf_Square {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of pi");
		double pi= s1.nextDouble();
		System.out.println("Enter the value of radius");
		double r=s1.nextDouble();
		
		double area=pi*r*r;
		System.out.println(area);

	}

}
