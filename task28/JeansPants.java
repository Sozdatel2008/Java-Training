package task28;

public class JeansPants implements Washing{
    private double waist_width;
    private double leg_length;

    public JeansPants(double waist_width, double leg_length) {
        this.waist_width = waist_width;
        this.leg_length = leg_length;
    }

    @Override
    public String toString() {
        return "JeansPants. Waist width: " + waist_width + ". Leg length: " + leg_length + ". Temperature: " + temperature() + ". Wash cycle: " + wash_cycle();
    }

    @Override
    public double temperature() {
        return 20;
    }

    @Override
    public String wash_cycle() {
        return "mixed";
    }
}
