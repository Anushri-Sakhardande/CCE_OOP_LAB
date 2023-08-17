import java.util.Scanner;
class PositiveNegativeZeros
{
	public static void main(String args[])
	{
		int numbers[] = new int[10];
		int positive=0,negative=0,zero=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for(int i=0; i<10; i++)
		{
			numbers[i] = sc.nextInt();
		}
		for(int i=0; i<10; i++)
		{
			if(numbers[i]>0)
			{
				positive++;
			}
			else if(numbers[i]<0)
			{
				negative++;
			}
			else
			{
				zero++;
			}
		}
		System.out.println("Number of positive values:"+positive);
		System.out.println("Number of negative values:"+negative);
		System.out.println("Number of zeros values:"+zero);
	}
}