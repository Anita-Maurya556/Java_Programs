package java_programms;
public class Operators_NonStatic_Methods {
	void add()
	{
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println("sum of two numbers is->"+sum);
	}
	void sub()
	{
		int a=200;
		int b=30;
		int sub=a-b;
		System.out.println("sub of two number is->"+sub);
	}
	void mul()
	{
		int a=20;
		int b=30;
		int mul=a*b;
		System.out.println("mul of two number is ->"+mul);
	}
	void div()
	{
		int a=200;
		int b=100;
		int div=a/b;
		System.out.println("div of two number is ->"+div);
	}
	void mod()
	{
		int a=100;
		 int b=50;
		int mod=a%b;
		System.out.println("mod of two number is->"+mod);
	}			

	public static void main(String[] args) {
		Operators_NonStatic_Methods o1=new Operators_NonStatic_Methods();
		o1.add();
		o1.sub();
		o1.mul();
		o1.div();
		o1.mod();
		
		
	}

}
