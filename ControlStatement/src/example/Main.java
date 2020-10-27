package example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**************compareTo()*******************

        //När man vill sortera strängar i bokstavsordning
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Meklo";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));*/


        /*******************equals() och if***********************
        Scanner scan =  new Scanner(System.in);
        System.out.println("Vilken färg är det på första rosen?");
        String s1 = scan.next();
        System.out.println("Vilken färg är det på andra rosen?");
        String s2 = scan.next();

        //Jämnföra två strängar med varandra
        //OM det är lika, skriv ut - det är lika
        //OM det inte är lika - skriv ut det är inte lika

        if(s1.equals(s2)){
            //Om detta stämmer  - villkoret är sant - boolean : true
            //Skriv ut detta
            System.out.println("Detta stämmer");
        }else{
            //Om inte första villkoret stämmer - villkoret är falskt - boolean : false
            //Skriv ut detta
            System.out.println("Detta stämmer inte");
        }*/


        /*****************Switch******************

        //NU har vi skapat ett nytt objekt av klassen Scanner
        //Vilket innehär att vi kan använda alla metoder som är publika
        //från klassen Scanner
        //scan är en refrensvariabel

        boolean hej = true;
        //while(hej)
        int i = 1; //Initierar min variabel

        //for(initerar min variabel  ; bestämmer villkoret   ; bestämmer ökningen )

        //Om villkoret stämmer kör while
        //Loppa while så länge vilkoret stämmer
        while(i <= 3){ //Bestämmer villkoret
            i++; //Bestämmer ökningen

            Scanner scan = new Scanner(System.in);
            //Ta emot en int och lägg den i en variabel som heter meny
            System.out.println("Skriv in ett heltal mellan 1-3");
            int meny = scan.nextInt();

            switch(meny){

                //Ta emot sifforna 1-3
                case 1:
                    //Kommer det in en 1a så ska detta hända
                    System.out.println("Du valde nummer 1");
                    break;
                case 2:
                    //KOmmer det in en 2a så ska detta hända
                    System.out.println("Du valde nummer 2");
                    break;
                case 3:
                    //Kommer en 3a in så ska detta hända
                    System.out.println("Du valde nummer 3");
                    break;

                default:
                    System.out.println("Inget stämde");

            }

        }*/

        /************For Loop**************


    //for(initerar min variabel  ; bestämmer villkoret   ; bestämmer ökningen )

        for(int i = 2; i <=5; i++){
            System.out.println(i);
        }

        //Mindre elegant
        //Inte så smidig
        String cars[] = {"Volvo", "BMV", "Ford", "Mazda"};

        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }*/

        /********************For Each*********************/

        //For Each är en elegantare version av For Loopen
        //den här används bara till arrayer
        //Gjort en ny array med 4 st element
        String cars[] = {"Volvo", "BMV", "Ford", "Mazda"};

        for(String i: cars ){
            System.out.println(i);
        }


    }





}
