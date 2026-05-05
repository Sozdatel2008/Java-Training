package task21;

// Add your own class that extends Person.
// In the main method, create objects of both subclasses and place them in a single array.
//  Call the greet() method on each element of the array.

public abstract class Person {
    
    String name;
    String surname;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        return "Name: " + name + ", Surname: " + surname;
    }

    public abstract void greet(Person p);
}
