package java_programms;

public class ConstructorOverloading_1 {

	public static void main(String[] args) {
		System.out.println("main method");
		main();
		main("Anita",'F');
		ConstructorOverloading_1 c1=new ConstructorOverloading_1();
		c1.main(500, 110.10);
		
	}
		
	public static void main()
	{
		System.out.println("main method with no argument");	
	}
	public static void main(String name,char gender)
	{
		System.out.println(" main method with argument as String and Gender");
      
	}
	void main(int a,double b)
	{
		System.out.println("main method with argument as int a and double b");
	}
	

}
