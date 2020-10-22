package zoo;

//Lånade böcker
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Deklarera en string array
        //Fylla den med djur av datatypen String
        //Skriva ut djuren

        //Skapa arrayen och fyll på direkt
        //String[] animals = {"Apa", "Lejon", "Delfin", "Giraff"};

        String[] animal = new String[4];

        //Fyller på arrayen efterhand
        animal[0] ="Apa";
        animal[1] ="Lejon";
        animal[2] = "Delfin";
        animal[3] = "Giraff";

        //Skriva ut hela arrayen
        System.out.println(Arrays.toString(animal));

        //Skriva över ett elementet på index 3
        animal[3] = "Åsna";

        //skriver ut arrayen med de nya värdena
        System.out.println(Arrays.toString(animal));

        //Spara arrayen i en variabel
        //Variabeln vara av samma datatyp som innehållet i arrayen
        String animals = Arrays.toString(animal);
        System.out.println(animals);

        //Skriva ut ett element
        System.out.println(animal[2]);

        //Hämta ett element och lagrar i en variabel
        //Skriva ut ett element
        String delfin = animal[2];
        System.out.println(delfin);

    }
}
