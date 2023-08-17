import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		float number1,number2,result=0;
		char operator,response;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter first number, operator, second number:");
			number1 = sc.nextFloat();
			operator = sc.next().charAt(0);
			number2 = sc.nextFloat();
			switch(operator)
			{
				case '+': result= number1+number2;
					  break;

				case '-': result= number1-number2;
					  break;

				case '*': result= number1*number2;
					  break;

				case '/': result= number1/number2;
					  break;
				default:System.out.println("Wrong input");
			}
			System.out.println(result);
			System.out.println("Enter y to continue and n to stop");
			response = sc.next().charAt(0);
		}while(response == 'y');
	}
}