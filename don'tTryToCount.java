import java.util.*;
public class file8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String x=sc.next();
            String s=sc.next();
            int p=0;
            boolean ans=false;
            while(x.length()<=50){
                if(x.contains(s)){
                    ans=true;
                    break;
                }
                x=x+x;
                p++;
            }
            if(!ans){
                System.out.println(-1);
            }
            else{
                System.out.println(p);
            }
        }
    }
}

