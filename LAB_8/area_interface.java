package LAB_8;
import java.util.Scanner;

public interface area_interface {
    float area();
}

class rectangle implements area_interface{
    public float area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        return length*breadth;

    }
}

class cicrcle implements area_interface{
    public float area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        return (float) (3.14*radius*radius);

    }
}