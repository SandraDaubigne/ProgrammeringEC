package uml;

import java.util.ArrayList;

public class Classroom {

    ArrayList<Student> students = new ArrayList<Student>();

    //Student skapas inte här inne
    public void addStudentToClassroom(Student student){
        students.add(student);
    }

}
