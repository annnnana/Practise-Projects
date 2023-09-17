import java.util.Scanner;

public class Menu {
    private ShapeManager shapeManager;

    public Menu(ShapeManager shapeManager) {
        this.shapeManager = shapeManager;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Rectangle");
            System.out.println("2. Add Trapezoid");
            System.out.println("3. Add Rhombus");
            System.out.println("4. Print Shapes");
            System.out.println("5. Print Geometric Center");
            System.out.println("6. Print Vertex Coordinates");
            System.out.println("7. Print Area of Shape");
            System.out.println("8. Remove Shape by Index");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    return;
                case 1:
                    System.out.print("Enter length for rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width for rectangle: ");
                    double width = scanner.nextDouble();
                    shapeManager.addShape(new Rectangle(length, width));
                    break;
                case 2:
                    System.out.print("Enter base 1 for trapezoid: ");
                    double base1 = scanner.nextDouble();
                    System.out.print("Enter base 2 for trapezoid: ");
                    double base2 = scanner.nextDouble();
                    System.out.print("Enter the height for trapezoid: ");
                    double height = scanner.nextDouble();
                    shapeManager.addShape(new Trapezoid(base1, base2, height));
                    break;
                case 3:
                    System.out.print("Enter side for rhombus: ");
                    double diagonal1 = scanner.nextDouble();
                    System.out.print("Enter height for rhombus: ");
                    double diagonal2 = scanner.nextDouble();
                    shapeManager.addShape(new Rhombus(diagonal1, diagonal2));
                    break;
                case 4:
                    shapeManager.printShapes();
                    break;
                case 5:
                    System.out.print("Enter figure index: ");
                    int indexCenter = scanner.nextInt();
                    shapeManager.printGeometricCenter(indexCenter - 1);
                    break;
                case 6:
                    System.out.print("Enter figure index: ");
                    int indexVertex = scanner.nextInt();
                    shapeManager.printVertexCoordinates(indexVertex - 1);
                    break;
                case 7:
                    System.out.print("Enter figure index: ");
                    int indexArea = scanner.nextInt();
                    double area = shapeManager.printShapeArea(indexArea - 1);
                    System.out.println("Shape #" + (indexArea) + " area: " + area);
                    break;
                case 8:
                    System.out.print("Enter index of shape to remove: ");
                    int indexToRemove = scanner.nextInt();
                    shapeManager.removeShape(indexToRemove - 1);
                    System.out.println("Shape #" + indexToRemove + " was removed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

