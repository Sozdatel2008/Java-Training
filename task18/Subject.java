package task18;

public class Subject {
    private final String subjectName;
    private Person teacher;
    private Student[] students;
    private int studentsCount;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
        this.students = new Student[10];
        this.studentsCount = 0;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student s) throws TooManyStudentsException {
        if(studentsCount >= students.length){
            throw new TooManyStudentsException("Too many students for this subject!");
        }
        students[studentsCount++] = s;
    }

    @Override
    public String toString() {
        String result = subjectName + ", teacher: " + teacher.getName() + ", students: ";

        for(int i = 0; i < studentsCount; i++){
            result += students[i].getName();
            if(i != studentsCount - 1){
                result += ", ";
            }
        }
        return result;
    }

}
