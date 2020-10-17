package Djur;

public class Main {

    public static void main(String[] args) {

        /*
        Skapar ett nytt objekt för varje djur och anropar dess metoder i dem olika klasserna.
         */

        // Skapar ett nytt objekt och kallar på klassen.metod
        Lejon lejon = new Lejon();
        lejon.showSound();

        // Skapar ett nytt objekt och kallar på klassen.metod
        Giraff giraff = new Giraff();
        giraff.showlength();

        // Skapar ett nytt objekt och kallar på klassen.metod
        Apa apa = new Apa();
        apa.showAge();

    } // End main
}
