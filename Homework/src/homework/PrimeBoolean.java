package homework;

public class PrimeBoolean
{
	public static void main(String[] args)
	{
		int a=23;
		boolean b=true;
		
		for(int i=2; i<a; i++)
		{
			if(a%i==0)
			{
				b=false;
				break;
			}
		}
		System.out.println(b);
	}
}