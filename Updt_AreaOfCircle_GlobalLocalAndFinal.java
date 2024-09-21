package java_programms;

public class Updt_AreaOfCircle_GlobalLocalAndFinal {
	 static int a=10;
	public static void main(String[] args) {
	 a=20;//global updated value 
	// int b=40;
	final int b=45; //local with final
          System.out.println(a);
          System.out.println(b);
	}

}
             