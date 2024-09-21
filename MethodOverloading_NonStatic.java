package java_programms;

public class MethodOverloading_NonStatic {

	
		 void add(int a ,int b )
		{
			int sum=a+b;
			System.out.println("sum of two double values a and b are ->"+sum);
		}
		 void add(double a,int b)
		{
			double sum=a+b;
			System.out.println("the sum of two int values  a and b are->"+sum);
		}
		 void add(double a,double b)
		{
			double sum =a+b;
			System.out.println("the sum of int and double  values  a and b are->"+sum);
		}
		 void add(char c,String s,boolean d)
			{
				
				System.out.println("I am "+s);
			}
		 		
		public static void main(String[] args) {
			 MethodOverloading_NonStatic m1= new  MethodOverloading_NonStatic();
					 m1.add(100, 50);
					 m1.add(9.89, 89);
					 m1.add(100.0, 100.10);
					 m1.add('C',"Anita",true);
					 
			
			
		}

	
	}


