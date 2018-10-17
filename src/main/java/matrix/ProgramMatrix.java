package matrix;

public class ProgramMatrix {
    public static void main(String[] args) {
        Matrix matrix1 = MatrixFactory.createRandomized(2, 3);
        Matrix matrix2 = MatrixFactory.createRandomized(3, 4);
        System.out.println(matrix1);
        System.out.println(matrix2);
        Matrix matrix = Summator.sum(matrix1, matrix2);
        System.out.println(matrix);

    }
}
