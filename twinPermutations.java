import java.util.*;

public class file8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                b[i]=(n+1)-arr[i];
            }
            for(int i=0;i<n;i++){
                System.out.print(b[i]+" ");
            }
            System.out.println();
        }
    }
}
