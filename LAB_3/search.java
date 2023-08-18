import java.util.Scanner;
public class search
{
    public static void main(String[] args) 
    {
        int n,searchKey;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        int list[] = new int[n];
        System.out.println("Enter elements");
        for(int i=0; i<n; i++)
        {
            list[i] = sc.nextInt();
        }
        System.out.println("enter search value");
        searchKey = sc.nextInt();
        System.out.print("Value found at locations:");
        for(int i=0; i<n; i++)
        {
            if(list[i] == searchKey)
            {
                System.out.print(i+" ");
            }
        }
    }
}
