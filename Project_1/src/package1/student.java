package package1;

public class student 
{
	int a;
	int b;
	
	public void display1()
	
	{
		
		System.out.println("I have started learning java program");
		
	}
      public void display2()
      {
    	  System.out.println("print display 2");
      }
      
      public static void main(String[] args)
      
      {
    	  student p=new student();
    	  p.display1();
    	  p.display2();
    	  p.a=500;
       System.out.println(p.a);			  
    	  p.b=600;
      System.out.println(p.b);
    	  
    	  
      }
}
