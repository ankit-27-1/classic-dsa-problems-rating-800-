import java.util.*;
public class file8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int ans=0;
            for(int i=0;i<n;i++){
                ans=ans^arr[i];
            }
            if(n%2==0){
                if(ans==0){
                    System.out.println(0);
                }
                else{
                    System.out.println(-1);
                }
            }
            else{
                System.out.println(ans);
            }
        }
    }
}
