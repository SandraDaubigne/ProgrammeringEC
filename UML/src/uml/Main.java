package uml;

public class Main {

    public static void main(String[] args) {

        //Så länge som denna person finns så finns id
        //Komposition
        Student person = new Student("Emma", 1234);
        System.out.println(person);

        Classroom classroom = new Classroom();
        classroom.addStudentToClassroom(person);
        System.out.println(classroom.students);

    }
}
