package Lambda;

public class Main {
    public static void main(String[] args) {
        // without Functional Interface java 8
        TriangleAreaCalculator tr = new TriangleAreaCalculator();
        tr.setA(3);
        tr.setH(5);
        System.out.println(volume(tr, 7));


        // java 8
        AreaCalculator areaCalculator = () -> 6 * 8;
        AreaCalculator circleCalculator = () -> Math.PI * 4 * 4;
        AreaCalculator triangleCalculator = () -> 5 * 6 / 2;

        System.out.println(volume(() -> 5 * 6 / 2, 7));
        System.out.println(volume(circleCalculator, 8));
    }

    public static double volume(AreaCalculator s, double h) {
        return s.area() * h;
    }

}

