import java.util.Scanner;
class program5
{
	public static void main(String[] args)
	{
		int num;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter any number from 1 to 12");
		num=scr.nextInt();
		if(num==12 || num==1 || num==2) {
			System.out.println("Entered number  " + num+ " represent winter season");
		} else if (num>=3 && num<=5)
		{
			System.out.println("Entered number  " + num+ " represent spring season");
		} else if (num>=6 && num<=8)
		{
			System.out.println("Entered number  " + num+ " represent summer season");
		} else if (num>=9 && num<=11)
		{
			System.out.println("Entered number  " + num+ " represent autumn season");
		} else {
			System.out.println("Entered number  " + num+ " doesn't represent any season");
			}
	}
}