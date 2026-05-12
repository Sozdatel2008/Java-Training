package task26;

public class Hexagon extends Figure{
    private final double sideLength;
    
    public Hexagon(String color, double width, double length, double sideLength) {
        super(color, width, length);
        this.sideLength = sideLength;
    }

    @Override
    double getArea() {
        return (3*Math.sqrt(3))/2 * Math.pow(sideLength, 2);
    }

    @Override
    public String getName() {
        return "hexagon";
    }

    @Override
    double getPerimeter() {
        return sideLength*6;
    }

    
}
