import java.util.*;
public class file8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int count=0;
            for(int i=0;i<n-1;i++){
                if(arr[i]%2==arr[i+1]%2){
                    count++;
                }
            }
            if(n==1){
                System.out.println(0);
            }
            else{
                System.out.println(count);
            }
        }
    }
}
