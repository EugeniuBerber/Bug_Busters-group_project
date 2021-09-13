package Task2;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea(11.2);
        circle.calculatePerimeter(9);
        System.out.println("\n===================================\n");
        Square square = new Square();
        square.calculateArea(12);
        square.calculatePerimeter(12);
    }
}
