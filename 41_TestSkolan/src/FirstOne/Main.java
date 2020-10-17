package FirstOne;

public class Main {

    public static void main(String[] args) {

        /********JONATAN**********/
        //Vi skapar objekt för att kunna komma åt attribut och metoder inne i klassern
        //som vi skapar objekt av
        Jonatan jonatan = new Jonatan();

        //Skapa ett objekt av klassen Jonatan

        //Hämtade Jonatan variabel hårfärg via klassinstansen
        System.out.println("Jonatans hårfärg är " + jonatan.hairColor);

        //Hämtade Jonatans metod via klassinstansen
        System.out.println("Här hämtar vi metoden showHairColor från klassen Jonatan ");
        jonatan.showHairColor();


        /********BENJAMIN**********/
        Benjamin benjamin = new Benjamin();
        System.out.println("Benjamins tröja är " + benjamin.shirtColor);
        benjamin.showShirtColor(); // Metodanrop


        /**********JOHANNES*********/
        //Skapa en johannes
        Johannes johannes = new Johannes();
        // hämta johannes metod via klassintansen
        johannes.showShoeSize();
        //Skriva ut johannes metod
        System.out.println();
    }
}
