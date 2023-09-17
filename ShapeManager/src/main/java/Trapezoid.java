public class Trapezoid extends Shape {
    private double base1;
    private double base2;
    private double height;

    public Trapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public void printInfo() {
        System.out.println("Trapezoid - Base 1: " + base1 + ", Base 2: " + base2 + ", Height: " + height);
    }

    @Override
    public void printVertexCoordinates() {
        System.out.println("Vertex Coordinates: (0,0), (" + base1 + ",0), (" + (base1 + ((base2 - base1) / 2)) + "," + height + "), (" + ((base2 - base1) / 2) + "," + height + ")");
    }

    @Override
    public void printGeometricCenter() {
        System.out.println("Geometric Center: (" + (base1 + ((base2 - base1) / 2)) + "," + (height / 2) + ")");
    }
}
