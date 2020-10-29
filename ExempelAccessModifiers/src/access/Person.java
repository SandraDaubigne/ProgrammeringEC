package access;

public class Person {


    //hårdkodning
    //public är default
    //Access modifier gör så att hela raden/blocket ändras i tillgänglighet

    //Skydda datan mot andra klasser
    //gör vi genom att sätta private framför
    //Datahiding

    //Medlemsvariabler
            //Instansvariabel tillhör objektet
            //Inte har static framför sig
            //Alla variabler som inte är satt som static tillhör alltså alltid objeket
     int age = 30;

            //Klassvariabel
            //Denna har static och säger att jag tillhör inte objektet
     static int aged = 60;


    //Konstruktor är default

    public void check(){
        System.out.println("Check");
    }

    //Satt till static OCH public
    //Även om jag inte skriver public så är den det
    //Så länge inte sätter nån annat framför

    //Jag tillhör inte objektet
    //Jag tillhör klassen
    public static void getMe(){
        System.out.println("You got me" + aged);
    }
}
