package java_programms;

public class Global_Variable1 {
	static int a=100;// static variable can be access directly in local variable
	int b=90;
	public static void main(String[] args) {
		System.out.println(a);
		Global_Variable1 g1=new Global_Variable1();//non static variable can be access in local variable by creating an object with reference variable 
		g1.b=10;//with the help of reference variable we can update the value also
		System.out.println(g1.b);
		

	}

}
