package java_programms;

public class Constructor_Overloading {
	Constructor_Overloading()
	{
		System.out.println("1st");
	}
	Constructor_Overloading(int a)
	{
		System.out.println("2st");
	}
	Constructor_Overloading(int a,int b)
	{
		System.out.println("3rd");
	}


	public static void main(String[] args) {
		new Constructor_Overloading();
		new Constructor_Overloading(5000);
		new Constructor_Overloading(5000,10000);
		
		

	}

}
