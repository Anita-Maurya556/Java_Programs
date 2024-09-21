package java_programms;

public class If_Else_If_Block {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		if(a==b)
		{
			System.out.println("if block ");
		}
		else if(b!=c)
		{
			System.out.println("else if block ");
		}
		else if(b>a)//can have multiple else if block in middle of if and else block
		{
			System.out.println("else if block ");
		}
		else  
		{
			System.out.println("else block");
		}
			
	}

}
