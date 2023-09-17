public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void printInfo() {
        System.out.println("Rectangle - Length: " + length + ", Width: " + width);
    }

    @Override
    public void printVertexCoordinates() {
        System.out.println("Vertex Coordinates: (0,0), (" + length + ",0), (" + length + "," + width + "), (0," + width + ")");
    }

    @Override
    public void printGeometricCenter() {
        System.out.println("Geometric Center: (" + length / 2 + "," + width / 2 + ")");
    }
}
