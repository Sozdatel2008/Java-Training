package task23;

public abstract class Animal {
    private final double weight;
    private final String animalName;

    public Animal(double weight, String animalName) {
        this.weight = weight;
        this.animalName = animalName;
    }

    public void getAnimalName() {
        System.out.println(animalName);
    }

    public void getWeight() {
        System.out.println(weight + "kg");
    }

    public abstract void makeSound();
}
