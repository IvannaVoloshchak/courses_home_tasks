package home_task1;

public class Task4_2 {
    public static void main(String[] args) {
        int n = 5;
        int k = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= k; j++) {
                System.out.print(" ");
            }
            k = k - 1;
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
        }
    }
}

