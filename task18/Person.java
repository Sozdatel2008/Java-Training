package task18;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHelloTo(Person person) {
        System.out.println("Hello " + person.getName() + "!");
    }

    public String getName() {
        return name;
    }
}
