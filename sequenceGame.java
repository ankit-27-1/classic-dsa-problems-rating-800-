import java.util.*;
public class file8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            ArrayList<Integer> list=new ArrayList<>();
            list.add(arr[0]);
            for(int i=1;i<n;i++){
                if(arr[i]<arr[i-1]){
                    list.add(1);
                }
                list.add(arr[i]);
            }
            System.out.println(list.size());
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
    }
}
