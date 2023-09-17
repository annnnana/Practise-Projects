import java.util.ArrayList;

public class ShapeManager {
    private ArrayList<Shape> shapeList;

    public ShapeManager() {
        this.shapeList = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapeList.add(shape);
    }

    public void removeShape(int index) {
        if (index >= 0 && index < shapeList.size()) {
            shapeList.remove(index);
        }
    }

    public void printShapes() {
        for (int i = 0; i < shapeList.size(); i++) {
            System.out.print("Shape " + (i + 1) + ": ");
            shapeList.get(i).printInfo();
        }
    }

    public void printGeometricCenter(int index) {
        if (index >= 0 && index < shapeList.size()) {
            shapeList.get(index).printGeometricCenter();
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void printVertexCoordinates(int index) {
        if (index >= 0 && index < shapeList.size()) {
            shapeList.get(index).printVertexCoordinates();
        } else {
            System.out.println("Invalid index.");
        }
    }

    public double printShapeArea(int index) {
        double area;
        if (index >= 0 && index < shapeList.size()) {
            return shapeList.get(index).calculateArea();
        } else {
            System.out.println("Invalid index.");
            throw new IllegalArgumentException("Invalid index.");
        }
    }

//    public double calculateTotalArea() {
//        double totalArea = 0;
//        for (Shape shape : shapeList) {
//            totalArea += shape.calculateArea();
//        }
//        return totalArea;
//    }
}
