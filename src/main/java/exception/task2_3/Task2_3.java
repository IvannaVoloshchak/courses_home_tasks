package exception.task2_3;

public class Task2_3 {
    public static void main(String[] args) {
        Car car = new Car();
        car.methodWithTry();
        car.methodWithTry(null);
        car.tryAndSkipFinally(null);
    }
}
