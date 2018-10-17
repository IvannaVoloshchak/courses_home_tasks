package home_task1;


public class Task1 {
    public static void main(String[] args) {
       int a = 839352366;
        char[] chars = String.valueOf(a).toCharArray();
       char b = '3';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==b) {
                count++;
            }
        }
        System.out.println("YOU can saw this number  " + count);

    }
}
