package homework;

public class ArrayArithmatic
{
	public static void main(String[] args)
	{
	int a[]=new int [5];
	a[0]=21;
	a[1]=25;
	a[2]=96;
	a[3]=45;
	a[4]=57;
	
	int b=a[1]+a[3];
	System.out.println("addition is "+b);
	
	int c=a[2]-a[1];
	System.out.println("subtraction is "+c);
	
	int d=a[2]/a[1];
	System.out.println("division is "+d);
	
	int e=a[1]*a[2];
	System.out.println("multiplication is "+e);
	
	int g=a[2]%a[1];
	System.out.println("module is "+g);
	
	 int f[]= {2,5,4,8,9,7};
	
	int i=f[0]+f[2];
	System.out.println("addition is "+i);
	
	int j=f[1]*f[3];
	System.out.println("multiplication is "+j);
	
	int k=f[4]/f[0];
	System.out.println("division is "+k);
	
	int l=f[4]-f[0];
	System.out.println("subtraction is "+l);
	
	int m=f[2]%f[1];
	System.out.println("module is "+m);
	}
}