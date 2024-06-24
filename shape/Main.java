package shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Square square = new Square(5);

        circle.calculateArea();
        square.calculateArea();
        circle.isShape();
        square.isShape();
    }
}
