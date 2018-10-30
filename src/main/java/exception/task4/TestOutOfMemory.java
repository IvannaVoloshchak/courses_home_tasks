package exception.task4;

public class TestOutOfMemory {
    public static void main(String[] args) {
        TestOutOfMemory leakGenerator = new TestOutOfMemory();
        leakGenerator.createArrays();
    }

    public void createArrays() {
        int arraySize = 20;

        // Create arrays in an infinite loop
        while (true) {
            System.out.println("Available memory (in bytes): " + Runtime.getRuntime().freeMemory());
            int[] fillMemory = new int[arraySize];
            arraySize = arraySize * 5;
        }
    }
}
