package LAB_5;

import java.util.Scanner;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width,height and depth");
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double d = sc.nextDouble();
        Box obj = new Box(w, h, d);
        System.out.println("The volume of the box is :" + obj.volume());
    }
}
