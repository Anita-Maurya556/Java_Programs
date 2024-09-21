package java_programms;

public class Static_NonStatic_Method {
	static void addition()
	{
		System.out.println("addition of a Number");
	}
	void subtraction()
	{
		System.out.println("subtraction of a number ");
	}

	public static void main(String[] args) {
		addition();
		Static_NonStatic_Method s1=new Static_NonStatic_Method();
		s1.subtraction();
				
		

	}

}
