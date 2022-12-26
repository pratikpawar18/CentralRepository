package homework;

public class SmallLarge 
{
	public static void main(String[] args) 
	{
	int a[]= {10,-12,30,5,45,87};
	int smallest=a[0];
	int largest=a[0];
	for(int i=0; i<a.length; i++)
	{
		if(a[i]<smallest)
		{
			smallest=a[i];
		}
		if(a[i]>largest)
		{
			largest=a[i];
		}
	}
    System.out.println("smallest number is "+smallest);
    System.out.println("largest number is "+largest);
	}
}