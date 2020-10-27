package aggregation;

import org.w3c.dom.Attr;

public class Main {

    public static void main(String[] args) {


        //Skapar ett objekt av klassen attributes
        Attributes attributes = new Attributes(37, "Brown");

        //Aggregationen vi skickar in attributes in i Person
        //Genom konstruktorn

        //Vi gör ett objekt av klassen Person
        Person person = new Person("Anna", attributes);

        //Hur gör jag om någon bara har ett av dessa attributer
        //Göran har inget hår

        //Här använder jag den konstrukrotn som har en parameter
        Attributes attributes1 = new Attributes(45);
        Person guran = new Person("Göran", attributes1);

        //Den här klassinstansen använder kostuktorn som har 2 parametrar
        Attributes att = new Attributes(24, "Yellow");

        System.out.println(person);
    }
}
