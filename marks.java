import java.util.Scanner;
class marks
{
	public static void main(String[] args)
	{
		int p=40;
		int obt;
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter your obtained marks");
		obt=scr.nextInt();
		if(obt>=p) {
			System.out.println("you are pass");
			if (obt>=90)
			{
				System.out.println("A Grade");
			} else if (obt>=75 && obt<90)
			{
				System.out.println("B Grade");
			} else if (obt>=65 && obt<75)
			{
				System.out.println("c Grade");
			}  else 
			{
				System.out.println("D Grade");
			}
		} else {
			System.out.println("you are fail");
		}
	}
}