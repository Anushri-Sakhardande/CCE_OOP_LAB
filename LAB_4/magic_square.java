import java.util.Scanner;
public class magic_square {
    boolean magic(int[][]a,int n){
        int sum1=0,sum2=0,sum3=0;
        for(int i=0;i<n;i++){
            sum1+=a[i][i];
            sum2+=a[i][n-i-1];
        }
        if(sum1!=sum2){
            return false;
        }
        
        for(int i=0;i<n;i++){
            sum2=0;
            sum3=0;
            for(int j=0;j<n;j++){
                sum2+= a[i][j];
                sum3+= a[j][i];
            }
            if(sum1!=sum2 && sum1!=sum3){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
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
        magic_square ob = new magic_square();
        boolean check = ob.magic(a, n);
        if(check == true){
            System.out.println("Magic square");
        }
        else{
            System.out.println("Not a magic square");
        }
    }
}
