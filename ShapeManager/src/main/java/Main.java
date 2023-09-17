public class Main {
    public static void main(String[] args) {
        ShapeManager shapeManager = new ShapeManager();
        Menu menu = new Menu(shapeManager);
        menu.run();
    }
}
