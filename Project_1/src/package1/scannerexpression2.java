package package1;

import java.util.Scanner;

public class scannerexpression2 

 {
	
	public static int mul(int a,int b)
	{
		
		int c;
		c=a*b;
		//System.out.println("result of mul: "+c);
		return c;
	}
	public static int sum(int a,int b)
	{
		
		int c;
		c=a+b;
		//System.out.println("result of sum is: "+c);
		return c;
	}
	
	public static int sub(int a,int b)
	{
		
		int c;
		c=a-b;
		//System.out.println("result of sum is: "+c);
		return c;
	}
	
	public static int div(int a,int b)
	{
		
		int c;
		c=a/b;
		//System.out.println("result of sum is: "+c);
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
		
		int sub1=sub(X1,X2);
		System.out.println("Subtraction of "+X1+" and "+X2+" = " +sub1);
		
		int sum1=sum(sub1,X3);
		System.out.println("Sum of "+sub1+ " and "+X3+" = " +sum1);
		
		int sub2=sub(sum1,X4);
		System.out.println("substraction of "+sum1+ " "+X4+" = " +sub2);
		
		int div=div(sub2,X5);
		System.out.println("division of "+sub2+ " and "+X5+" = " +div);
		
		
		int result=mul(div,X6);
		System.out.println("Multiplication of "+div+ " and "+X6+" = " +result);
		
		System.out.println("Final Result (((X1-X2)+X3)-X4)/X5)*X6 = " +result);
		
		
		
		
		
		
	}

}
