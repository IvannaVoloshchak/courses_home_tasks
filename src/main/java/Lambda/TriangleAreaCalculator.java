package Lambda;

public class TriangleAreaCalculator implements AreaCalculator{

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    private int h;
    @Override
    public double area() {
        return a*h/2;
    }
}
