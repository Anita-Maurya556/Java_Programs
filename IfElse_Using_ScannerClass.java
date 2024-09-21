package java_programms;

import java.util.Scanner;

public class IfElse_Using_ScannerClass {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		int  age = s1.nextInt();
		if (age >=18)
		{
			System.out.println("person is eligible for vote ");
		}
		else
		{
			System.out.println("person is not eligible for vote");
			
		}
	}

}
