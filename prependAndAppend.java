import java.util.*;
public class file8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            String s=sc.next();
            if(s.length()==1){
                System.out.println(1);
            }
            else if(s.length()==2){
                if((s.charAt(0)=='0' && s.charAt(1)=='1') || (s.charAt(0)=='1' && s.charAt(1)=='0')){
                    System.out.println(0);
                }
                else{
                    System.out.println(2);
                }
            }
            else{
                int k=0;
                int j=s.length()-1;
                while(k<j){
                    if((s.charAt(k)=='0' && s.charAt(j)=='1') || (s.charAt(k)=='1' && s.charAt(j)=='0')){
                        k++;
                        j--;
                        n-=2;
                    }
                    else{
                        break;
                    }
                }
                System.out.println(n);
            }
        }
    }
}
