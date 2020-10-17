package Djur;

public class Delfin {


    //Konstruktor
    public Delfin() {
    }

    //Inget attribut


    //Göra en metod som skriver ut färgen grå

    //En metod som tar in 2 parametrar
    //Metoden lämnar inget returvärde
    //Det ser vi att det står void (tomt)

    public void showColor(String color, int age){

        System.out.println("Färgen är: " + color + "Och åldern är: "+ age);
    }



// En metod med returvärde int
    //Metoden tar in en parameter

    int lengt = 16;

    public int showNumber(int age, int lengt){

        //System.out.println("Det blev" + age);
        return age + lengt;

    }




}


