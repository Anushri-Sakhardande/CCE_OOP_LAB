class triangle
{
    public static void main(String args[])
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        int numbers[] = {1,2,3,4,5};
        for(int i:numbers)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}