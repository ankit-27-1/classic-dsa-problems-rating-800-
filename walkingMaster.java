import java.util.*;
public class file8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            if(x1==x2 && y1==y2){
                System.out.println(0);
            }
            else{
                if(y1>y2){
                    System.out.println(-1);
                }
                else{
                    if(x1+y2-y1<x2){
                        System.out.println(-1);
                    }
                    else{
                        System.out.println((2*(y2-y1)+(x1-x2)));
                    }
                }
            }
        }
    }
}
