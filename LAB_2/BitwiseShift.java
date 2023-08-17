import java.util.Scanner;
class BitwiseShift
{
	public static void main(String args[])
	{
		int number;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();
		System.out.println("Multiplication by two:"+(number<<1));
		System.out.println("Division by two:"+(number>>1));
	}
}