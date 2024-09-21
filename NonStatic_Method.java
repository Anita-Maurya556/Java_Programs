package java_programms;

public class NonStatic_Method {

	void add()
	{
		System.out.println("Adding two numbers");
	}
	public static void main(String[] args) {
		
		{
			//NonStatic_Method n1=new NonStatic_Method();
			//n1.add();
			System.out.println("My main method");
			NonStatic_Method n1=new NonStatic_Method();
			n1.add();
		}
		

	}

}
