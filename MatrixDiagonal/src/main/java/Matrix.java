import java.util.Scanner;

public class Matrix {
    private double[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    public void inputMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = sc.nextDouble();
            }
        }
    }

    public boolean hasElementBelow(double compareWith) {
        for (int i = 0; i < Math.min(rows, cols); i++) {
            if (data[i][i] < compareWith) {
                return true;
            }
        }
        return false;
    }

    public void printResult(String matrixName, double compareWith) {
        if (hasElementBelow(compareWith)) {
            System.out.println("Matrix " + matrixName + " contains elements below " + compareWith + " on the main diagonal.");
        } else {
            System.out.println("Matrix " + matrixName + " does not contain elements below " + compareWith + " on the main diagonal.");
        }
    }
}