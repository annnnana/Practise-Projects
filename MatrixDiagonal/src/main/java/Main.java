public class Main {

    public static void main(String[] args) {

        Matrix A = new Matrix(5, 5);
        Matrix B = new Matrix(3, 3);

        A.inputMatrix();
        B.inputMatrix();

        A.printResult("A", 0);
        B.printResult("B", 2.7);
    }
}