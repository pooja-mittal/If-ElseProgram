import java.util.Scanner;
class FindCharacter
{
	public static void main(String[] args)
	{
		char ch;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter any character");
		ch=scr.next().charAt(0);
		 if (ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='i' || ch=='o' || ch=='u' )
		{
			System.out.println("vowel");
		} else if((ch>'A' && ch<='Z') || (ch>'a' && ch<='z'))  {
			System.out.println("consonant");
		} else {
			System.out.println("error");
		}
	}
}