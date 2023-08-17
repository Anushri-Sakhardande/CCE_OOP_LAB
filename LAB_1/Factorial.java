import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		int factorial=1,number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();
		for(int i=2; i<=number; i++)
		{
			factorial*=i;
		}
		System.out.println("The factorial is "+factorial);
		sc.close();
	}
}