package java_programms;

public class Method_Overloading {
	static void addition(double a ,double b )
	{
		double sum=a+b;
		System.out.println("sum of two double values a and b are ->"+sum);
	}
	static void addition(int a,int b)
	{
		int sum=a+b;
		System.out.println("the sum of two int values  a and b are->"+sum);
	}
	static void addition(int a,double b)
	{
		double sum =a+b;
		System.out.println("the sum of int and double  values  a and b are->"+sum);
	}
	
	public static void main(String[] args) {
		addition(32,64);
		addition(100.0,55.55);
		addition(100,110.10);
		
	}

}
