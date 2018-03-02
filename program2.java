import java.util.Scanner;
class program2
{
	public static void main(String[] args)
	{
		int num1, num2;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter ist number");
		num1=scr.nextInt();
		System.out.println("enter 2nd number");
		num2=scr.nextInt();
		if(num1>num2) 
			System.out.println(num1+ " is bigger");
		else if (num2>num1)
		
			System.out.println(num2+ " is bigger");
		 else 
			System.out.println("both are equal");
	}
}