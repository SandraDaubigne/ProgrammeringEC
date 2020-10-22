package example;

public class Person {

    //Skapa en person med attribut ålder, adress, namn
    //Skapa en konstruktor
    //Skapa 4 personer av objektet Person

    int age;
    String adress;
    String name;


    public Person(int age, String adress, String name) {
        this.age = age;
        this.adress = adress;
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", adress='" + adress + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
