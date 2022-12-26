package homework;

public class Startype1
{
	public static void main(String[] args)
	{
		int a=5;                                    //max star in row
		for(int b=a; b>=1; b--)                     //first row max star
		{
			for(int c=(a-b); c>=1; c--)             
			{
				System.out.print(" ");              //space
			}
			for (int c=1; c<=b; c++)
			{
				System.out.print("*");             //star
			}
		System.out.println();
		}
	}
}