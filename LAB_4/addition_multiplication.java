import java.util.Scanner;
public class addition_multiplication {
    
    void addition(int m1[][], int m2[][],int r1,int c1,int r2,int c2){
        if(r1!=r2 && c1!=c2){
            System.out.println("Adiition not possible");
            return;
        }
        int add[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                add[i][j] = m1[i][j]+m2[i][j];
            }
        }
        System.out.println("The added matrix is:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
    }

    void multiplication(int m1[][], int m2[][],int r1,int c1,int r2,int c2){
        if(c1!=r2){
            System.out.println("Multiplication not possible");
            return;
        }
        int[][] mult= new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                mult[i][j] = 0;
                for(int k=0;k<r2;k++){
                    mult[i][j]+=m1[i][k]*m2[k][j];
                }
            }
        }
        System.out.println("The multiplied matrix is:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(mult[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1,col1,row2,col2;
        System.out.println("Enter rows and columns for first matrix");
        row1 = sc.nextInt();
        col1 = sc.nextInt();
        int[][] mat1 = new int[row1][col1];
        System.out.println("Enter the elements for the first matrix");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter rows and columns for second matrix");
        row2 = sc.nextInt();
        col2 = sc.nextInt();
        int[][] mat2 = new int[row2][col2];
        System.out.println("Enter the elements for the second matrix");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                mat2[i][j] = sc.nextInt();
            }
        }

        addition_multiplication ob = new addition_multiplication();
        ob.addition(mat1,mat2,row1,col1,row2,col2);
        ob.multiplication(mat1,mat2,row1,col1,row2,col2);
    }
}
