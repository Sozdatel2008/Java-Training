package task21;

public class Student extends Person{
    
    int indexNumber;

    public Student(String name, String surname, int indexNumber){
        super(name, surname);
        this.indexNumber = indexNumber;
    }

    public void greet(Person p){
        System.out.println("Hi! My name is " + p.name + "! I'm student.");
    }
}


