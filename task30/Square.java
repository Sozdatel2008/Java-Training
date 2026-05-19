package task30;

public class Square implements Comparable<Square>{
    private final int length;
    private final int number;
    private static int counter;

    public Square(int length) {
        this.length = length;
        this.number = counter++;
    }

    public int getArea(int length){
        return length * length;
    }

    @Override
    public String toString() {
        return "Number of the square: " + number + ". Its area: " + getArea(length) + ".";
    }

    @Override
    public int compareTo(Square other) {
        return this.number - other.number;
    }
}
