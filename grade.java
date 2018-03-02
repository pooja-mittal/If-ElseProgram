import java.util.Scanner;
class grade
{
	public static void main(String[] args)
	{
		char ch;
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter your grade");
		ch=scr.next().charAt(0);
		if(ch=='a')
			System.out.println("excellent");
		else if(ch=='b')
			System.out.println("ok ok");
		else if(ch=='c')
			System.out.println("fail");
		else
			System.out.println("invalid grade");
	}
}