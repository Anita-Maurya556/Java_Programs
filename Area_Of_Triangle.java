package java_programms;

import java.util.Scanner;

public class Area_Of_Triangle {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of base ");
		 int b= s1.nextInt();
		System.out.println("Enter the value of height");
		int h=s1.nextInt();
		double t=0.5*b*h;
		
		System.out.println(t);
	}

}
