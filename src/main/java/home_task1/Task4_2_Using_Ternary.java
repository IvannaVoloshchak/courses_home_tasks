package home_task1;

public class Task4_2_Using_Ternary {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                System.out.print(j > i ? " " : j);
            }
            System.out.println();
        }
    }
}
