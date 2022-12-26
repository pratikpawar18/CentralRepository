package homework;//not correct

public class ArrayLargeNumber
{
  public static void main(String[] args)
  {
	  int a[]= {12,23,56,89,25};
	  int large=0;
	  int x=a.length;
	
	  for(int i=0; i<x; i++)
	  {
		  if(a[i]>large)
		  {
			  large=a[i];
		  }
	  }
	  System.out.println("largest number is "+large);
  }
}