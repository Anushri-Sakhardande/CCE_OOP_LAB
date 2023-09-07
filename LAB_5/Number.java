package LAB_5;

import java.util.Scanner;

public class Number {
    private double number;

    Number(int n)
    {
        number = n;
    }
    boolean isZero()
    {
        return (number == 0);
    }
    boolean isPositive()
    {
        return (number>0);
    }
    boolean isNegative()
    {
        return (number<0);
    }
    boolean isOdd()
    {
        return (number%2 != 0);
    }
    boolean isEven()
    {
        return (number%2 == 0);
    }
    boolean isPrime()
    {
        boolean ret=true;
        for(int i=2; i<number ; i++)
        {
            if(number%i==0)
            {
                ret = false;
                break;
            }
        }
        return ret;
    }
    boolean isArmstrong()
    {
        int n=(int)number;
        double sum=0;
        boolean ret=false;
        while(n!=0)
        {
            int digit = n%10;
            sum = Math.pow(digit,3);
            n /=10;
        }
        if(sum == number)
        {
            ret = true;
        }
        return ret;
    }
}
class main_class
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Number obj = new Number(n);
        System.out.println(obj.isZero());
        System.out.println(obj.isPositive());
        System.out.println(obj.isNegative());
        System.out.println(obj.isOdd());
        System.out.println(obj.isEven());
        System.out.println(obj.isPrime());
        System.out.println(obj.isArmstrong());
    }
}