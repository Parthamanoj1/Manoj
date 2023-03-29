import java.util.Scanner;
class  PositiveOrNegitive
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number othher than 0");
		int num=scn.nextInt();
		if(num>0)
		{
			System.out.println(num+" is positive");
		}
		else
		{
			System.out.println(num+"is negitive");
		}
	}
}
