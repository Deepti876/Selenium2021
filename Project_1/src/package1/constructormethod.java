package package1;

public class constructormethod 
{
	
	public constructormethod() // () indicate this is like method
	{
		this(10,20,30);
		System.out.println("i am a default constructormethod");
	}
		
	public constructormethod(int a) // () indicate this is like method
	{
		this();
		System.out.println("I am one parameterized constructormethod");
	}
	
	public constructormethod(int a,int b) // () indicate this is like method
	{
		this(10,20,30,40);
		System.out.println("I am two parameterized constructormethod");
	}
	
	public constructormethod(int a,int b,int c) // () indicate this is like method
	{
		
		System.out.println("I am three parameterized constructormethod");
	}
	
	
	public constructormethod(int a,int b,int c,int d) // () indicate this is like method
	{
		this(10);
		System.out.println("I am four parameterized constructormethod");
	}
	
   public static void main(String[] args) 
   
 {
	   constructormethod s=new constructormethod(20,30);
     
			
}
}
