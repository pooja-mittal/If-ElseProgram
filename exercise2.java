import java.util.Scanner;
class exercise2
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		int a;
		System.out.println("enter number");
		a=scr.nextInt();
		if(a>5) {
			if ((a>8 && a<10) || (a>33))  {
				System.out.println("good");
			} else {
				System.out.println("bad");
		}
	   } else {
			System.out.println("out of range");
		}
	}
}