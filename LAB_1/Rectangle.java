import java.util.Scanner;
class Rectangle
{
	public static void main(String args[])
	{
		int length,breadth;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth");
		length = sc.nextInt();
		breadth = sc.nextInt();
		int circumference = 2*(length + breadth);
		int area = length*breadth;
		System.out.println("Circumference="+circumference);
		System.out.println("Area="+area);
	}
}