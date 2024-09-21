package java_programms;

public class Global_Variable {
	int a=100;// global variable// que can we add non static global variable in local variable
	static int b=200;
	static double pi;
	static String name;//for String null will be output
	
	static boolean answer;
	
	

	public static void main(String[] args) {
		int c=300;//local variable
		answer=true;
		name="Anita";
		System.out.println(c+b);
		System.out.println(pi);
		System.out.println(name);
		System.out.println(answer);
		
		
	}

}
