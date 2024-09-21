package java_programms;

import java.util.Scanner;

public class Scanner_Methods {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your first name");
		String Firstname=s1.next();
		System.out.println("the sky is blue");
		boolean b1=s1.nextBoolean();
		
		System.out.println("enter the range of byte");
		byte b2=s1.nextByte();
		System.out.println("enter your mobile number");
		long l1=s1.nextLong();//left side in the yellow color means...it is accepting the human input and it is not close
		s1.close();
		
	}

}


//que=intilized the value of each method of scanner class
