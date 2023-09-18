package LAB_8;
import java.util.Scanner;

public abstract class area_abstract {
    abstract float area();
}

class rectangle extends area_abstract{
    public float area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        return length*breadth;

    }
}

class cicrcle extends area_abstract{
    public float area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        return (float) (3.14*radius*radius);

    }
}
