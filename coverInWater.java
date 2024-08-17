import java.util.*;
public class file8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            String s=sc.next();
            char[] arr=new char[n];
            for(int i=0;i<n;i++){
                arr[i]=s.charAt(i);
            }
            boolean ans1=false;
            boolean ans2=false;
            int count=0;
            int p=0;
            for(int i=0;i<n;i++){
                if(arr[i]=='.'){
                    p++;
                    count++;
                    ans1=true;
                }
                else{
                    p=0;
                }
                if(p==3){
                    ans2=true;
                }
            }
            if(ans1){
                if(ans2){
                    System.out.println(2);
                }
                else{
                    System.out.println(count);
                }
            }
            else{
                System.out.println(0);
            }
        }
    }
}
