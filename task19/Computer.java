package task19;

public class Computer {
    private static int counter;

    private final int id;
    private final String chip;
    private final double memory;

    public Computer(String chip, double memory) {
        this.chip = chip;
        this.memory = memory;
        this.id = ++counter;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", type of chip: " + chip + ", memory size: " + memory;
    }
}
