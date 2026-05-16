package task28;

public class WoolSweater implements Washing{
    private String pattern;
    private String color;

    public WoolSweater(String pattern, String color) {
        this.pattern = pattern;
        this.color = color;
    }

    @Override
    public String toString() {
        return "WoolSweater. Color: " + color + ". Pattern: " + pattern + ". Temperature: " + temperature() + ". Wash cycle: " + wash_cycle();
    }

    @Override
    public double temperature() {
        return 15;
    }

    @Override
    public String wash_cycle() {
        return "wool";
    }
}
