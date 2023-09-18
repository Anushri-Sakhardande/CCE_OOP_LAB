package LAB_8;
import java.util.Scanner;

public abstract class area_abstract2 {
    abstract float area();
}

class rectangle extends area_abstract{
    public float area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side");
        int side = sc.nextInt();
        return side*side;

    }
}

class cicrcle extends area_abstract{
    public float area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int base = sc.nextInt();
        System.out.println("Enter the height");
        int height = sc.nextInt();
        return (float) (0.5*base*height);

    }
}