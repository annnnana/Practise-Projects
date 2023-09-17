import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;

        System.out.println("Select a shape 1: Circle, 2: Rectangle, 3: Triangle: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 2:
                System.out.print("Enter length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double width = scanner.nextDouble();
                shape = new Rectangle(length, width);
                break;
            case 3:
                System.out.print("Enter side1 of the triangle: ");
                double side1 = scanner.nextDouble();
                System.out.print("Enter side2 of the triangle: ");
                double side2 = scanner.nextDouble();
                System.out.print("Enter side3 of the triangle: ");
                double side3 = scanner.nextDouble();
                shape = new Triangle(side1, side2, side3);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        if (shape != null) {
            System.out.println("Selected shape: " + shape.getClass().getSimpleName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
        }
    }
}
