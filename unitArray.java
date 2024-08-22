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
            int a=0;
            int b=0;
            for(int i=0;i<n;i++){
                if(arr[i]==1){
                    a++;
                }
                else{
                    b++;
                }
            }
            if(a>=b && b%2==0){
                System.out.println(0);
            }
            else if(a>=b && b%2!=0){
                System.out.println(1);
            }
            else{
                boolean ans=false;
                int count=0;
                while(ans==false){
                    if(a>=b && b%2==0){
                        System.out.println(count);
                        ans=true;
                    }
                    else if(a>=b && b%2!=0){
                        System.out.println(count+1);
                        ans=true;
                    }
                    a++;
                    b--;
                    count++;
                }
            }
        }
    }
}
