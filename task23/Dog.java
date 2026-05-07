package task23;

public class Dog extends Animal{

    public Dog(double weight, String animalName) {
        super(weight, animalName);
    }

    @Override
    public void makeSound() {
        System.out.println("Woooof!");
    }

    
}
