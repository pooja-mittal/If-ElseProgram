import java.util.Scanner;
class largest
{
	public static void main(String[] args)
	{
		int x,y,z;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter x");
		x=scr.nextInt();
		System.out.println("enetr y");
		y=scr.nextInt();
		System.out.println("enter z");
		z=scr.nextInt();
		if((x>y) && (x>z)){
			System.out.println("out of  " + x + " " +y+ " " + z+ " : " + x + " is the largest" );
		} else if ((y>x) && (y>z))
		{
			System.out.println("out of  " + x + " " +y+ " " + z+ " :  " + y + " is the largest" );
		} else {
			System.out.println("out of  " + x + " " +y+ " " + z+ " :  " + z + " is the largest" );
		}
	}
}