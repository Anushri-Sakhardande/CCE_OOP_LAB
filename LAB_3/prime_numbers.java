import java.util.Scanner;
class prime_numbers
{
    public static void main(String args[])
    {
        int m,n;
        boolean isPrime;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("Prime  numbers between "+m+" and "+n);
        for(int i=m; i<=n; i++)
        {
            isPrime = true;
            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && i!=1)
            {
                System.out.println(i);
            }
        }
    }
}