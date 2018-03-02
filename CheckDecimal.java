import java.util.Scanner;
class checkDecimal
{
	public static void main(String[] args)
	{
		double num;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter any number");
		num=scr.nextDouble();
		if(num==0)
			System.out.println(num+ " is zero");
		else 
			System.out.println("either positive or negative");
	}
}