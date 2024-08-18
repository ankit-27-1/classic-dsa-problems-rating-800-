import java.util.*;
public class file8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int a=0;
            int max=1;
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                if(map.containsKey(arr[i])){
                    int p=map.get(arr[i]);
                    map.put(arr[i],p+1);
                    if(map.get(arr[i])>max){
                        a=arr[i];
                        max=map.get(a);
                    }
                }
                else{
                    map.put(arr[i],1);
                }
            }
            if(!map.containsKey(m)){
                System.out.println("NO");
            }
            else if(a==m){
                System.out.println("YES");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
