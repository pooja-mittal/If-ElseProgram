import java.util.Scanner;
class calories
{
	public static void main(String[] args)
	{
		double weight;
		char life;
		int af;
		double total;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter your weight");
		weight=scr.nextDouble();
		System.out.println("enter your lifestyle");
		life=scr.next().charAt(0);
		if (life=='A') {
			af=15;
			total=af*weight;
			System.out.println("your weight because of your activeness is:  " + total);
		} else if (life=='S')
		{
			af=13;
			total=af*weight;
			System.out.println("your weight because of your inactiveness is:  " + total);
		} else {
			System.out.println("weight can't be calculated");
			System.out.println("working in local");
			
		}
	}
}