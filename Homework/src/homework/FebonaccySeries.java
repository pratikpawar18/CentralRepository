package homework;

public class FebonaccySeries 
{
	public static void main(String[] args)
	{
		int a=0;
		int b=4;                                    //start from
		int c;
		for(int i=1; i<=10; i++)
		{
			c=a+b;
			a=b;
			b=c;
		 System.out.print(" "+c);
		}
	}
}