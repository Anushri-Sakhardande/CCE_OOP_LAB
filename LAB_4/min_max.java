import java.util.Scanner;
public class min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min,max;
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
        }
        min=max=a[0];
        for(int i:a){
            if(i>max){
                max = i;
            }
            if(i<min){
                min = i;
            }
        }
        System.out.println("Minimum value:"+min);
        System.out.println("Maximum value:"+max);
    }
}
