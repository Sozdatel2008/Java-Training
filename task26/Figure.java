package task26;

public abstract class Figure {
    private String name = "figure";
    private final String color;
    private final double width;
    private final double length;

    public Figure(String color, double width, double length) {
        this.name = name;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "This figure is: " + getName() + ". It has color: " + getColor() + ". Its area is: " + getArea() + ". And its perimeter: " + getPerimeter();
    }
    
}
