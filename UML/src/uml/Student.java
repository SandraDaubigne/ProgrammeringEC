package uml;

public class Student {

    private String name;
    private ID id;

    //Skapa en stundent
    //
    // för att kunna släppa in den i klassrummet


    //Tvinga ID att skapas här inne
    //jag vill skapa en komposition
    //Id inte ska kunna finnas till utan Student
    //Id är hårt kopplat till Student
    //Om student tas bort så tas också id bort
    public Student(String name, int ssn) {
        this.name = name;
        this.id = new ID(ssn);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
