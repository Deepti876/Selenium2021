package package1;

public class class_1 
{  // indicates the boundary of the class
   int a;   //declared a variable ,it will store integer value
   
   public void dispay1()     // ()   indicate this is a method
   
   {  // we have a boundary of the method also
	   
	   System.out.println("I have started learning java class");
   }

  public static void main(String[] args)
  {
       class_1 java=new class_1();
       java.dispay1();   // is the keyword used for calling
       java.a=200;  // calling the variable
       System.out.println(java.a);
       java.a=300;
       System.out.println(java.a);
  }



}






