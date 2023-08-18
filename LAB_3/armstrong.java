import java.util.Scanner;
class armstrong
{
    public static void main(String args[])
    {
        int number,digit,numberCopied,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        number = sc.nextInt();
        numberCopied = number;
        while(number!=0)
        {
            digit = number%10;
            sum += Math.pow(digit,3);
            number /=10;
        }
        if(sum == numberCopied)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an armstrong number");
        }
    }
}