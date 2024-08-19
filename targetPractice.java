import java.util.Scanner;
public class file8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            char[][] arr = new char[10][10];
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextLine().toCharArray();
            }

            int sum = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (arr[i][j] == 'X') {
                        int minIndex = Math.min(Math.min(i, 9 - i), Math.min(j, 9 - j));
                        sum += (minIndex + 1);
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
