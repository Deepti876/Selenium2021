package package1;

public class constructor 
{
	
	public constructor() // () indicate this is like method
	{
	    this(1);
	    System.out.println("i am a default constructor");
	}
		
	public constructor(int a) // () indicate this is like method
	{
		this(10,20,30,40);
		System.out.println("I am one parameterized constructor");
	}
	
	public constructor(int a,int b) // () indicate this is like method
	{
	    this(10,20,30);
		System.out.println("I am two parameterized constructor");
	}
	
	public constructor(int a,int b,int c) // () indicate this is like method
	{
		this();
		System.out.println("I am three parameterized constructor");
	}
	
	
	public constructor(int a,int b,int c,int d) // () indicate this is like method
	{
	
		System.out.println("I am four parameterized constructor");
	}
	
   public static void main(String[] args) 
   
   {
	
	   constructor s=new constructor(10,20);
   
   }
}
;