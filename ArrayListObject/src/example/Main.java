package example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> personlist = new ArrayList<Person>();

        Person sandra = new Person(37, "hemma", "Sandra");
        Person johan = new Person(24, "Borta", "Johan");

        //Kan göra så här
        personlist.add(sandra);
        personlist.add(johan);

        //Skriva ut personerna
        System.out.println(personlist);

        //Eller så här
        //personlist.add(new Person(37, "hemma", "Sandra"));



    }
}
