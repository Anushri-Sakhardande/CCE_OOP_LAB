import java.util.Scanner;
class Conversion
{
	public static void main(String args[])
	{
		int Integer;
 		double Double;
		char Character;
		byte IntToByte;
		int CharToInt;
		byte DoubleToByte;
		int DoubleToInt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer");
		Integer = sc.nextInt();		
		System.out.println("Enter a Double number");
		Double = sc.nextDouble();
		System.out.println("Enter a Character");
		Character = sc.next().charAt(0);
		IntToByte = (byte)Integer;
		System.out.println("int to byte:"+IntToByte);
		CharToInt = (int)Character;
		System.out.println("char to int:"+CharToInt);
		DoubleToByte = (byte)Double;
		System.out.println("double to byte:"+DoubleToByte);
		DoubleToInt = (int)Double;
		System.out.println("double to int:"+DoubleToInt);
	}
}