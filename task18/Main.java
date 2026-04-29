package task18;

public class Main {
    
    //Without changing the contents of the main method, make the following code execute correctly.
    //Note: the Subject class may refer to a collection of students (e.g., an array). 
    //Adding students to this collection may risk overflow, which raises an exception.

    public static void main(String args[]) {

        Person p1 = new Person("Jan", 50);

        Student s1 = new Student("Jasiek", 20);

        Person p3 = (Person)s1;

        p1.sayHelloTo(p3); //Hi Jasiek!

        p3.sayHelloTo(p1); //Hi Jan!

        Subject s = new Subject("GUI");

        s.setTeacher(p1);

        try {

            s.addStudent(s1);

        } catch(TooManyStudentsException e) {

            e.printStackTrace();

        }

        System.out.println(s); //GUI, teacher: Jan, students: Jasiek
    }
}
