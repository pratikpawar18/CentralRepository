package homework;

public class ArrayEvenOdd
{
	public static void main(String[] args)
	{
	int a[]= {12,25,47,56,58,61,89,31,3,2,0,-22};
	int x=a.length;
	
	System.out.println("following are even numbers");
	for(int i=0; i<x; i++)
	{
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
		}
	}
    System.out.println("following are odd numbers");
    for(int i=0; i<x; i++)
    {
    	if(a[i]%2!=0)
    	{
    		System.out.println(a[i]);
    	}
    }
	}
}