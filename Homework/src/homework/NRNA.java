package homework;

public class NRNA
{
   public void submultidiv()
   {
	int a=23;
	int b=65;
	int c=b-a;
	int d=a*b;
	int e=b/a;
	System.out.println("sub is "+c);
	System.out.println("multi is "+d);
	System.out.println("div is "+e);
   }
	public static void main(String[] args)
	{
		NRNA obj=new NRNA();
		obj.submultidiv();
	}
}