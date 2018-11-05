package io;

public class Program {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Red";
        car.hp = 200;
        car.wheels = 4;

        String carInJson = "{'color':'Red','hp':200, 'wheels':4}";
    }
}
