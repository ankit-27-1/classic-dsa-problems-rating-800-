import java.util.*;
public class file8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 2) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(1);
            } else if (count % 2 == 0) {
                int k = 0;
                int splitIndex = -1;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == 2) {
                        k++;
                    }
                    if (k == count / 2) {
                        splitIndex = i + 1;
                        break;
                    }
                }
                System.out.println(splitIndex);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
