package task19;

public class PersonalComputer extends Computer{
    private final String userName;

    public PersonalComputer(String chip, double memory, String userName) {
        this.userName = userName;
        super(chip, memory);
    }

    @Override
    public String toString() {
        return super.toString() + ", username: " + userName;
    }
}
