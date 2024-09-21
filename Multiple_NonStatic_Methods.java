package java_programms;

public class Multiple_NonStatic_Methods {
	    void add()
	    {
	    	int a=10;
	    	int b=20;
	    	int c=a+b;
	    	System.out.println(c);
	    }
	    void sub()
	    {
	    	System.out.println("Subtraction");
	    }
	    void mul()
	    {
	    	System.out.println("Multiplication");
	    }
	

	public static void main(String[] args) {
		System.out.println("main method");
		Multiple_NonStatic_Methods m1= new Multiple_NonStatic_Methods ();
		m1.add();
		m1.sub();
		m1.mul();
		

	}

}
