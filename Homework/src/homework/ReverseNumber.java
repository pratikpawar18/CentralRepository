package homework;

public class ReverseNumber
{
	public static void main(String[] args)
	{
	int a=100;                         //number to be reverse
	int b;                             //reminder
	int c=0;                           //reverse number
	while(a!=0)
	{
		b=a%10;                        //reminder
		c=c*10+b;                      //0*10+reminder=reminder
		a=a/10;                        //remaining number for reverse
	}
	System.out.println(c);
	}
}