package task26;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("blue", 12, 5);
        Square square = new Square("red", 4, 4);
        Triangle triangle = new Triangle("green", 12, 9);
        Circle circle = new Circle("yellow", 7, 7);
        Hexagon hexagon = new Hexagon("black", 12, 12, 3);

        Figure[] figures = {rectangle, square, triangle, circle, hexagon};

        for (Figure fig : figures) {
            System.out.println(fig);
        }
    }
}
