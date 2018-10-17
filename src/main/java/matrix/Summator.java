package matrix;

public class Summator {

    public static Matrix sum(Matrix a, Matrix b) {
        if (a.getHorizontalSize() != b.getHorizontalSize() || a.getVerticalSize() != b.getVerticalSize()) {
            throw new RuntimeException("Illegal matrix dimensions.");
        }
        Matrix c = new Matrix(a.getHorizontalSize(), a.getVerticalSize());
        for (int i = 0; i < c.getVerticalSize(); i++) {
            for (int j = 0; j < c.getHorizontalSize(); j++) {
                c.setElement(i, j, (a.getElement(i, j) + b.getElement(i, j)));
            }
        }
        return c;
    }
}



