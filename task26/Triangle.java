package task26;

public class Triangle extends Figure{

    public Triangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    double getArea() {
        return (getWidth() * getLength())/2;
    }

    @Override
    double getPerimeter() {
        return getWidth() + getLength() + Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getLength(), 2));
    }

    @Override
    public String getName() {
        return "triangle";
    }
    
    
}
