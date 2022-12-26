package homework;

public class SwappingWithout3rdVariable
{
 public static void main(String[] args)
 {
	 int a=14;
	 int b=23;
	 System.out.println("before swap "+a+" "+b);
	 a=a+b;
	 b=a-b;
	 a=a-b;
	 System.out.println("after swap "+a+ " "+b);
 }
}