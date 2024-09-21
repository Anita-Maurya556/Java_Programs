package java_programms;

import java.util.Scanner;

public class Area_Of_Rectangle {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of Lenght ");
		 double l=s1.nextDouble();
		 System.out.println("Enter the value of width");
		  double b= s1.nextDouble();
			double area =l*b;	  
		System.out.println("area of a rectangle is-> "+area);
	}

}
