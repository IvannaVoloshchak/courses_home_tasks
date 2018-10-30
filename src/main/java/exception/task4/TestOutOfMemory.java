package exception.task4;

import org.apache.log4j.Logger;

public class TestOutOfMemory {
    private static final Logger filelogger = Logger.getLogger("FILELOGGER");

    public static void main(String[] args) {
        TestOutOfMemory leakGenerator = new TestOutOfMemory();
        leakGenerator.createArrays();
    }

    public void createArrays() {
        int arraySize = 20;

        // Create arrays in an infinite loop
        while (true) {
            filelogger.warn("Available memory (in bytes): " + Runtime.getRuntime().freeMemory());
            int[] fillMemory = new int[arraySize];
            arraySize = arraySize * 5;
        }
    }
}
