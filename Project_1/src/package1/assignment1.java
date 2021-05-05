package package1;

public class assignment1 
{
	public int sum(int a,int b)    // a and b are local variables
	{
		int c;
		c=a+b;
		System.out.println("result of sum is: "+c);
		return c;
	}
	
	
	public int sub(int x,int y)
	
	{
		int z;
		z=x-y;
		System.out.println(" result of sub is: "+z);
		return z;
	}
	
	public int mul(int m,int n)

	{
		
		int o;
		o=m*n;
		System.out.println(" result of mul is: "+o);
		return o;
	}
	
	public void div(int a1,int b1)
	
	{
		
		int a3;
		a3=a1/b1;
		System.out.println(" result of dic is: "+a3);
    }
	
	public static void main(String[] args)
	
	{
		
		assignment1 calculation=new assignment1();
		int sumresult=calculation.sum(10,2);
		int sumresult1=calculation.sum(sumresult, 2);
		int subresult=calculation.sub(sumresult1, 2);
		int mulresult=calculation.mul(subresult, 2);
		calculation.div(mulresult, 2);
		
	}
	
	
}

