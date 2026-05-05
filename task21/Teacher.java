package task21;

public class Teacher extends Person {

    int indexTeacherNumber;

    public Teacher(String name, String surname, int index) {
        super(name, surname);
        this.indexTeacherNumber = index;
    }

    public void greet(Person p){
        System.out.println("Hi! My name is " + p.name + "! I'm professor.");
    }

    public static void main(String[] args) {
        Student student1 = new Student("Kacper", "Lewandowski", 1);
        Teacher teacher1 = new Teacher("Slawomir", "Maj", 1);
        Student student2 = new Student("Tomash", "Strzał", 1);
        Teacher teacher2 = new Teacher("Artur", "Kwiecień", 1);

        Person[] array = {student1, student2, teacher1, teacher2};

        for(Person people : array){
            people.greet(people);
        }
        
    }
    
}
