import java.util.Scanner;
public class principal_diagonal
{
    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of matrix");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                    a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The diagonal elements are:");
        for(int i=0;i<n;i++){
                    System.out.println(a[i][i]);
                    sum+=a[i][i];
        }
        System.out.println("sum:"+sum);
    }
}