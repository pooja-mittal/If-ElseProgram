import java.util.Scanner;
class CheckPositive
{
	public static void main(String[] args)
	{
		int num;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter any no:");
		num=scr.nextInt();
		if(num>=0) 
			System.out.println(num+ " is positive");
		else
			System.out.println(num+ " is negative");
	}
}