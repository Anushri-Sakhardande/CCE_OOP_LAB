import java.util.Scanner;
class Table
{
	public static void main(String args[])
	{
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(number+"*"+i+"="+number*i);
		}
	}
}