package task_string;
import java.util.HashMap;

public class SomeString {

    public static void main(String[] args) {
        String line = "Dong-ding-dong";
        showLetterCount(line);
        compareLines(line, "Dong-ding-DONG");
        System.out.println(line.toUpperCase());
        System.out.println(line.toLowerCase());
        printIndexForWord(line, "dong");
        printIndexForWord(line);
        replace(line);
        countWords(line);
    }

    public static void showLetterCount(String line) {
        String lineWithoutDash = line.replaceAll("-", "");
        System.out.println(lineWithoutDash.length());
    }

    public static void compareLines(String line1, String line2) {
        System.out.println(line1.equalsIgnoreCase(line2));
    }

    public static void printIndexForWord(String line, String word) {
        line = line.toLowerCase();
        for (int index = line.indexOf(word); index >= 0; index = line.indexOf(word, index + word.length())) {
            System.out.println(index);
        }
    }

    public static void printIndexForWord(String line){
        line = line.toLowerCase();
        int index = 0;
        while (index >= 0) {
            index = line.indexOf("dong", index);
            System.out.println(index);
            index = line.indexOf("dong", index + "dong".length());
        }
    }

    public static void replace(String line) {
        System.out.println(line.toLowerCase().replaceAll("d", "b"));
    }

    public static void countWords(String line) {
        line = line.toLowerCase();
        String[] words = line.split("-");
        HashMap<String, Integer> wordMap = new HashMap<>();

        for (String word : words) {
            wordMap.put(word, (wordMap.get(word) == null ? 1 : (wordMap.get(word) + 1)));
        }
        System.out.println(wordMap);
    }
}
