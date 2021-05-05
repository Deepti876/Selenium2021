package package1;

import java.util.Scanner;

public class swapno 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter value of x1");
		int X1=s.nextInt();
		System.out.println("Please enter value of x2");
		int X2=s.nextInt();
		// X1 = {{value}} and X2 =  {{value}}
		System.out.println("Before Swap: X1 = "+X1 + " and X2 = "+X2);
		int X3=0;
	    X3=X1;
	    X1=X2;
	    X2=X3;
	    
	    System.out.println("After Swap : X1  = "+X1 + " and X2 = "+X2);
		
		 
	}
	
	

}
