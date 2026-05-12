package task26;

public class Square extends Rectangle{

    public Square(String color, double width, double length) {
        super(color, width, length);
    }
    
    @Override
    double getArea() {
        return super.getArea();
    }

    @Override
    double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName() {
        return "square";
    }
}
