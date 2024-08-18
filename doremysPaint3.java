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
            if(n<=2){
                System.out.println("Yes");
            }
            else{
                boolean equal=true;
                for(int i=0;i<n-1;i++){
                    if(arr[i]!=arr[i+1]){
                        equal=false;
                    }
                }
                if(equal){
                    System.out.println("Yes");
                }
                else{
                    HashMap<Integer,Integer> map=new HashMap<>();
                    for(int i=0;i<n;i++){
                        if(map.containsKey(arr[i])){
                            int p=map.get(arr[i]);
                            map.put(arr[i],p+1);
                        }
                        else{
                            map.put(arr[i],1);
                        }
                    }
                    Arrays.sort(arr);
                    if(map.size()==2){
                        if(map.get(arr[0])==map.get(arr[n-1]) || map.get(arr[0])==map.get(arr[n-1])+1 || map.get(arr[0])+1==map.get(arr[n-1])){
                            System.out.println("Yes");
                        }
                        else{
                            System.out.println("No");
                        }
                    }
                    else{
                        System.out.println("No");
                    }
                }
            }
        }
    }
}
