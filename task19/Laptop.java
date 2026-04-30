package task19;

public class Laptop extends PersonalComputer{
    private final double weight;

    public Laptop(String chip, double memory, String userName, double weight) {
        this.weight = weight;
        super(chip, memory, userName);
    }

    public double checkWeight() throws Exception {
        if (weight > 5000)
        {
            throw new Exception("This laptop is not ergonomic - too heavy, over 5000g!");
        }
       
        
        return weight;
    }

    @Override
    public String toString() {
        return super.toString() + ", weight: " + weight;
    }
}
