package package1;

public class Assignment2 
{
	public int sub(int a, int b)
    
    {
    	int c;
    	c=a-b;
    	System.out.println(" return of sub is:"+c);
    	return c;
    }

     public int sum(int m,int n)
     {
    	 int p;
    	 p=m+n;
    	 System.out.println("return of sum is:"+p);
    	 return p;
     }
     
     public int mul(int x,int y)
     
     {
    	 int z;
    	 z=x*y;
    	 System.out.println("return of mul is:"+z);
    	 return z;
    	 
     }
     
     public void div(int a1,int b1)
     {
    	 int c1;
    	 c1=a1/b1;
    	 System.out.println("return of sum is:"+c1);
    	 
     }
     
     public static void main(String[] args) 
     {
		
    	 Assignment2 object=new Assignment2();
    	 int subresult=object.sub(10,2);
    	 int sumresult=object.sum(subresult,2);
    	 int subresult1=object.sub(sumresult,2);
    	 int mulresult=object.mul(subresult1,2);
    	 object.div(mulresult,2);
	}
}



