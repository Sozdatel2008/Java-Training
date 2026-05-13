package task27;

public class Main {
    public static void main(String[] args) {

        Dog burek = new Dog("Burek");
        Bunny bunny = new Bunny("Jake", "black");

        Pet[] pets = {burek, () -> System.out.println("Scratching post, wet food and water"), bunny, () -> System.out.println("Fearful")};

        for(Pet p : pets){
            p.conditions();
            System.out.println(p.commonProblem());
        }

    }
}
