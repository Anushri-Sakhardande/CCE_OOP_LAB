import java.util.Scanner;
public class non_diagonal {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of matrix");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                    a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                if(i!=j){
                    System.out.println(a[i][j]);
                    sum+=a[i][j];
                }
            }
        }
        System.out.println("sum:"+sum);
    }
}
