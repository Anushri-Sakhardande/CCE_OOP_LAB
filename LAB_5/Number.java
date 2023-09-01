package LAB_5;

public class Number {
    double number;

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
        Number obj = new Number(157);
        boolean b;
        b=obj.isZero();
        System.out.println(b);
        b=obj.isPositive();
        System.out.println(b);
        b=obj.isNegative();
        System.out.println(b);
        b=obj.isEven();
        System.out.println(b);
        b=obj.isOdd();
        System.out.println(b);
        b=obj.isPrime();
        System.out.println(b);
        b=obj.isArmstrong();
        System.out.println(b);

    }
}