package LAB_5;

import java.util.Scanner;

public class complex {
    String add(int int_no, int comp_no[]) {
        String ans = Integer.toString(int_no + comp_no[0]) + "+i" + comp_no[1];
        return ans;
    }

    String add(int comp_no1[], int comp_no2[]) {
        String ans = Integer.toString(comp_no1[0] + comp_no2[0]) + "+i" + Integer.toString(comp_no1[1] + comp_no2[1]);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for adding integer and complex number and 2 for adding two complex numbers");
        int choice = sc.nextInt();
        String ans;
        int no1[] = new int[2];
        int no2[] = new int[2];
        complex obj = new complex();
        switch (choice) {
            case 1:
                System.out.println("Enter integer and coefficient of complex number");
                no1[0] = sc.nextInt();
                no2[0] = sc.nextInt();
                no2[1] = sc.nextInt();
                ans = obj.add(no1[0], no2);
                break;
            case 2:
                System.out.println("Enter coefficients of complex numbers");
                no1[0] = sc.nextInt();
                no1[1] = sc.nextInt();
                no2[0] = sc.nextInt();
                no2[1] = sc.nextInt();
                ans = obj.add(no1, no2);
                break;
            default:
                ans = "Incorrect input";
        }
        System.out.println(ans);
    }
}
