public class Test1 {
    public static void main(String[] args) {
        ShapeManager shapeManager = new ShapeManager();
        Menu menu = new Menu(shapeManager);

        // Adding some shapes for testing
        shapeManager.addShape(new Rectangle(5, 3));
        shapeManager.addShape(new Trapezoid(3, 6, 4));
        shapeManager.addShape(new Rhombus(8, 6));

        menu.run();
    }
}