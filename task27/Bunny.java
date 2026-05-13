package task27;

public class Bunny implements Pet{
    String name;
    String color;

    public Bunny(String name, String color) {
        this.name = name;
        this.color = color;
    }

   
    @Override
    public void conditions() {
        System.out.println("Field of grass, carrot and water");
    }

    @Override
    public String commonProblem() {
        return "Predators";
    }
}
