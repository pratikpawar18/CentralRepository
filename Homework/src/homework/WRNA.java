package homework;

public class WRNA 
{
	public int sub()
	{
		int a=20;
		int b=30;
		int c=b-a;
		return c;	
	}
	public int multi()
	{
		int a=20;
		int b=10;
		int c=b*a;
		return c;	
	}
	public int div()
	{
		int a=20;
		int b=30;
		int c=b/a;
		return c;	
	}
	public static void main(String[] args) 
	{
     WRNA obj=new WRNA();
     
     int x=obj.sub();
     System.out.println("sub is "+x);
     
     int y=obj.multi();
     System.out.println("multi is "+y);
     
     int z=obj.div();
     System.out.println("div is "+z);
	}
}
