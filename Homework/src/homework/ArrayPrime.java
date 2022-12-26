package homework;

public class ArrayPrime
{
	public static void main(String[] args) 
	{
     int a[]= {2,3,4,5,6,7,8,9};
     int x=a.length;
     int f=0;
     System.out.println("prime numbers are below");
     
     for(int i=0; i<x; i++)
     {
      for(int b=2; b<a[i]; b++)
      {
    	  if(a[i]%b==0)
    	  {
    		 f++;
    	  }
      }
      if(f==0)
      {
    	  System.out.println(a[i]);
      }
      else
      {
    	  System.out.println();
      }
     }
	}
}