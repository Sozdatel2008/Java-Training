package task27;

public class Dog implements Pet{
    String name;

    public Dog(String name){
        this.name = name;
    }

    public void conditions(){
        System.out.println("Enough food and water");
    }

    public String commonProblem(){
        return "Fleas";
    }
}
