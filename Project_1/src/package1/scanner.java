package package1;

import java.util.Scanner;

public class scanner 
 {
	
	public static int mul(int a,int b)
	{
		
		int c;
		c=a*b;
		System.out.println("result of mul: "+c);
		return c;
	}
	public static int sum(int a,int b)
	{
		
		int c;
		c=a+b;
		System.out.println("result of sum is: "+c);
		return c;
	}
	
	public static int sub(int a,int b)
	{
		
		int c;
		c=a-b;
		System.out.println("result of sum is: "+c);
		return c;
	}
	
	public static int div(int a,int b)
	{
		
		int c;
		c=a/b;
		System.out.println("result of sum is: "+c);
		return c;
	}
	public static void main(String[] args) 
	
	{
		System.out.println("X1,X2,X3,X4,X5,X6");
		Scanner s=new Scanner(System.in);
		System.out.println("Print  expression ((((x1*x2)+x3)+x4)-x5)/x6)))");
		
		System.out.println("Please enter value of x1");
		int X1=s.nextInt();
		System.out.println("Please enter value of x2");
		int X2=s.nextInt();
		System.out.println("Please enter value of x3");
		int X3=s.nextInt();
		System.out.println("Please enter value of x4");
		int X4=s.nextInt();
		System.out.println("Please enter value of x5");
		int X5=s.nextInt();
		System.out.println("Please enter value of x6");
		int X6=s.nextInt();
		
		int mult1=mul(X1,X2);
		System.out.println("Multiplication of "+X1+" and "+X2+" = " +mult1);
		
		int sum1=sum(mult1,X3);
		System.out.println("Sum of "+mult1+ " and "+X3+" = " +sum1);
		
		int sum2=sum(sum1,X4);
		System.out.println("Sum of "+sum1+ " "+X4+" = " +sum2);
		
		int sub1=sub(sum2,X5);
		System.out.println("Subtraction of "+sum2+ " and "+X5+" = " +sub1);
		
		
		int result=div(sub1,X6);
		System.out.println("Division of "+sub1+ " and "+X6+" = " +result);
		
		System.out.println("Final Result ((((x1*x2)+x3)+x4)-x5)/x6))) = " +result);
		
		
		
		
		
		
	}
	
	

}
