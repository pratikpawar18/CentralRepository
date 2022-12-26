package homework;

public class NRWA 
{
	public void smd(int a, int b)
	{
		int c=a-b;
		int d=a*b;
		int e=b/a;
		System.out.println("sub is "+c);
		System.out.println("multi is "+d);
		System.out.println("div is "+e);
	}
	public static void main(String[] args) 
	{
		NRWA obj=new NRWA();
		obj.smd(12,22);
	}
}
