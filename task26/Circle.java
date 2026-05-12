package task26;

public class Circle extends Figure{
    public Circle(String color, double width, double length) {
        super(color, width, length);
    }

    @Override
    double getArea() {
        return Math.PI * (getWidth())/2;
    }

    @Override
    double getPerimeter() {
        return Math.PI * getWidth();
    }

    @Override
    public String getName() {
        return "circle";
    }

    
}
