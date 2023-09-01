package LAB_5;

import java.util.Scanner;

public class employee {
    String name;
    String city;
    int basic_sal;
    float DA;
    float HRA;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter city");
        city = sc.nextLine();
        System.out.println("Enter basic salary");
        basic_sal = sc.nextInt();
        System.out.println("Enter dearness allowance");
        DA = sc.nextFloat();
        System.out.println("Enter house rent");
        HRA = sc.nextFloat();
    }

    double calculate() {
        double total = basic_sal + basic_sal * (DA / 100) + basic_sal * (HRA / 100);
        return total;
    }

    void display() {
        System.out.println("Employee name:" + name);
        System.out.println("Total salary:" + calculate());
    }

    public static void main(String[] args) {
        employee obj = new employee();
        obj.getdata();
        obj.display();
    }
}
