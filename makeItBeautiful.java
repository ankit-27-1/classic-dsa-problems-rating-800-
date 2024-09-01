import java.util.*;
public class file8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            ArrayList<Integer> list =new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(sc.nextInt());
            }
            boolean ans=false;
            for(int i=0;i<n-1;i++){
                if(list.get(i)!=list.get(i+1)){
                    ans=true;
                }
            }
            if(ans){
                System.out.println("YES");
                Collections.sort(list,Collections.reverseOrder());
                if(list.get(0)==list.get(1)){
                    list.add(0,list.get(n-1));
                    list.remove(n);
                }
                for(int i=0;i<list.size();i++){
                    System.out.print(list.get(i) +" ");
                }
                System.out.println();
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
