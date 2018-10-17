package matrix;

public class Matrix {
     private int[][] a;

    Matrix(int x, int y) {
        a = new int[x][y];
    }

    public int getHorizontalSize() {
        return a.length;
    }

    public int getVerticalSize() {
        return a[0].length;
    }

    public int getElement(int x, int y) {
        return a[x][y];
    }


    public void setElement(int x, int y, int element) {
        a[x][y]=element;
    }

    @Override
    public String toString()
    {
        String str = "";

        for (int i = 0 ; i<getHorizontalSize() ; i ++ ){
            for (int j = 0 ; j < getVerticalSize() ; j++){
                str += a[i][j]+"\t";
            }
            str += "\n";
        }
        return str;
    }
}
