package matrix;

import java.util.Random;

public class MatrixFactory {

    public static Matrix createRandomized(int x, int y) {
        Matrix matrix = new Matrix(x, y);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix.setElement(i, j, getRandomNumberInRange(-20, 20));
            }
        }
        return matrix;
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
