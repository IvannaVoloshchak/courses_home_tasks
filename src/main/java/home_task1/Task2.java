package home_task1;

public class Task2 {
    public static void main(String[] args) {
        int numbers[] = {1, 4, 6, 8, -34, -5, 7, 0, 2};
        System.out.println("Average of numbers " + average(numbers));
        System.out.println("Max number is:  " + maxValue(numbers));
        System.out.println("Min number is : " + minValue(numbers));
        System.out.println(" You enter " + numbers.length + " numbers");

    }

    static double average(int numbers[]) {
        double average;
        int sumOfAverage = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumOfAverage = sumOfAverage + numbers[i];
        }
        average = sumOfAverage / numbers.length;
        return average;
    }

    static int maxValue(int numbers[]) {
        int maxValue = numbers[0];
        for (int num : numbers) {
            if (maxValue < num) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    static int minValue(int numbers[]) {
        int minValue = numbers[0];
        for (int num : numbers) {
            if (minValue > num) {
                minValue = num;
            }
        }
        return minValue;
    }

}
