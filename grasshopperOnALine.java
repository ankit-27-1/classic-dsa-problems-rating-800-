import java.util.*;

public class file8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int sum=0;
            int p=n;
            ArrayList<Integer> list=new ArrayList<>();
            while(sum<=n && p>0){
                if(p%k!=0 && sum+p<=n){
                    list.add(p);
                    sum+=p;
                }
                else{
                    p--;
                }
            }
            System.out.println(list.size());
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }
}
