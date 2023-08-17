import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		int year;
		boolean isLeap;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		year = sc.nextInt();
		if(year%100==0 && year%400==0)
		{
			isLeap = true;
		}
		else if(year%100!=0 && year%4==0)
		{
			isLeap = true;
		}
		else
		{
			isLeap = false;
		}
		if(isLeap)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}
}