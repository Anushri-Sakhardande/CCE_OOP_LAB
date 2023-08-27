
import java.util.Scanner;
public class search
{
    public static void main(String[] args) 
    {
        int searchKey,count=0;
        Scanner sc = new Scanner(System.in);
        int list[] ={1,2,3,1,2,1,5,6,7};
        System.out.println("enter search value");
        searchKey = sc.nextInt();
        System.out.print("Value found at locations:");
        for(int i:list)
        {
            if(i == searchKey)
            {
                System.out.print(count+" ");
            }
            count++;
        }
    }
}
