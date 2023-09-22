package LAB_8;
import java.util.Scanner;

interface hardware_software {
    void input();
}

class hardware implements hardware_software{
    String category;
    String manufacturer;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter category of the item:");
        category = sc.nextLine();
        System.out.println("Enter original manufacturer:");
        manufacturer = sc.nextLine();
    }
}

class software implements hardware_software{
    String type;
    String os;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter category of the item:");
        type = sc.nextLine();
        System.out.println("Enter original manufacturer:");
        os = sc.nextLine();
    }
}

public class hardware_software_main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sales=0;
        int choice=1;
        String product;
        do {
            System.out.println("Enter hardware or software");
            product= sc.nextLine();
            if(product.equalsIgnoreCase("software"))
            {
                software obj = new software();
                obj.input();
                sales++;
            }
            else if(product.equalsIgnoreCase("hardware"))
            {
                hardware obj = new hardware();
                obj.input();
                sales++;
            }
            System.out.println("Enter 0 to terminate and 1 to continue");
            choice = sc.nextInt();

        } while(choice == 1);
        
        System.out.println("Total sales:"+sales);
    }
}