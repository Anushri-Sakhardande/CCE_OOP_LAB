import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		int reverse=0,digit,number,numberCopied;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();
		numberCopied = number;
		while(number!=0)
		{
			digit = number%10;
			reverse = reverse*10 + digit;
			number/=10;
		}
		if(reverse == numberCopied)
		{
			System.out.println(numberCopied + " is a Palindrome");
		}
		else
		{
			System.out.println(numberCopied + " is not a Palindrome");
		}
	}
}