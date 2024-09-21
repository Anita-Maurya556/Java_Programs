package java_programms;

public class Global2 {
	static int a =90;// when the value is global after declaring and initilization then we	 cant write the same data type again

	public static void main(String[] args) {
		a=10;//global ...we can update global variabe like this
		int b=100;//if we write the data type again as int a=100 locally then it will become local variable
		System.out.println(a);
		System.out.println(b);//local
		

	}

}
