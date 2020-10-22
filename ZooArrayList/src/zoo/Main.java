package zoo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Göra en arraylist som innehåller alla djuren
        ArrayList<String> animals = new ArrayList<>();

        //Lägga till djur
        animals.add("Delfin");
        animals.add("Apa");
        animals.add("Lejon");
        animals.add("Giraff");

        //Skriva ut arrayList
        System.out.println("Skriver ut hel arrayList " + animals);

        //Hämta ett värde
        System.out.println("Hämtar värde " + animals.get(2));

        //Ta bort ett index
        animals.remove(0);
        System.out.println("Hämtar värde efter remove " + animals.get(2));

        //Ändra ett värde
        animals.set(0, "Get");
        System.out.println("Skriver ut hel arrayList efter bytt apa till get " + animals);

        //Radera allt i listan
        animals.clear();
        System.out.println(animals);
    }



}
