package homework;

public class Startype2 
{
	public static void main(String[] args)
	{
		int a=5;
		  for(int b=1; b<=a; b++)
		  {
			 for(int c=(a-b); c>=1; c--)
			 {
				 System.out.print(" ");            //space
			 }
			 for(int c=1; c<=b; c++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		  }
	}

}