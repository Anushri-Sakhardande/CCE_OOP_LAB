import java.util.Scanner;
public class symmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        System.out.println("Enter the dimension of matrix");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                if(a[i][j]!=a[j][i]){
                    flag=false;
                }
            }
        }
        if(flag){
            System.out.println("Symmetric matrix");
        }
        else
        {
            System.out.println("Non a symmetric matrix");
        }
    }
}
