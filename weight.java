import java.util.Scanner;
class weight
{
	public static void main(String[] args)
	{
		double pound;
		double kilo;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter weight in pound");
		pound=scr.nextDouble();
		if(pound>=0){
			kilo=(pound)/(2.2);
			System.out.println(pound + " pound in kg equal to:  " + kilo);
		} else {
			System.out.println("weight can never be zero and negative, try with some positive number");
		}
	}
}