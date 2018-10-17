package home_task1;

public class Task4_1 {
    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j > i ? " " : j);
            }
            System.out.println();
        }
    }
}