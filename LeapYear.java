import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args)
	{
		int year;
	Scanner scr= new Scanner(System.in);
	System.out.println("enter the year");
	year=scr.nextInt();
	if((year%4==0) && (year%100 !=0)) {
		System.out.println(year+ " is a leap year");
		} else if (year%400==0)
		{
			System.out.println(year+ " is a leap year");
		} else {
			System.out.println(year+ " not leap year");
		}
	}
}