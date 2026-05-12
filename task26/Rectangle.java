package task26;

public class Rectangle extends Figure{

    public Rectangle(String color, double width, double length) {
        super(color, width, length);
    }

    @Override
    double getArea() {
        return getWidth() * getLength();
    }

    @Override
    double getPerimeter() {
        return 2*(getWidth() + getLength());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName() {
        return "rectangle";
    }
}
