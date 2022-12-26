package homework;

public class WRWA 
{
	public int subtraction(int a, int b)
	{
		int c=a-b;
		return c;
	}
	public int multiplication(int a,int b)
	{
		int c=a*b;
		return c;
	}
	public int division(int p,int q)
	{
		int r=p/q;
		return r;
	}
		public static void main(String[] args)
	{
		WRWA obj=new WRWA();
		
		int x=obj.subtraction (45, 20);
		System.out.println("Subtraction is "+x);
		
		int y=obj.multiplication(12, 10);
		System.out.println("multiplication is "+y);
		
		int z=obj.division(60, 12);
		System.out.println("division is "+z);
	}
}
