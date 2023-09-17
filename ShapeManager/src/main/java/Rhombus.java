public class Rhombus extends Shape {
    private double diagonal1;
    private double diagonal2;

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calculateArea() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public void printInfo() {
        System.out.println("Rhombus - Diagonal 1: " + diagonal1 + ", Diagonal 2: " + diagonal2);
    }

    @Override
    public void printVertexCoordinates() {
        double a = diagonal1 / 2;
        double b = diagonal2 / 2;
        System.out.println("Vertex Coordinates: (0, " + b + "), (0," + (-b) + "), (" + (-a) +",0), (" + a + ", 0)");
    }

    @Override
    public void printGeometricCenter() {
        double a = diagonal1 / 2;
        double b = diagonal2 / 2;

        double centerX = (a + 0) / 2;
        double centerY = (b + 0) / 2;

        System.out.println("Geometric Center: (" + centerX + ", " + centerY + ")");
    }

}
