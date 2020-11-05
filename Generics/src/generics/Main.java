package generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /**************GENERICS MED ARRAYLIST*********************

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Hello"); //Objekt*/

        /*
        myList.add(100);
        myList.add(false);*/

        //Casta
        //Typecasting
        //Casting

        //Behöver inte längre casta
        //String myval2 = (String) myList.get(1);

        /*******
        String myval = myList.get(0);*/


        /**************GENERIC CLASSES*********************

        Container<Integer, String> container = new Container(100, "You");
        container.printItems();*/

        /********************GENERIC METHODS************/

        Integer[] numbers = {1,2,3,4,5};
        Character[] characters = {'a','b','c','d','e'};

        printMe(numbers);
        printMe(characters);

    }

    //Generic method
    public static <T> void printMe(T[] i){
        for(T x : i ){
            System.out.println(x);
        }
    }

    //Vi måste annars overloada för varje ny typ vi gör
    //för varje array som har ny typ måste vi göra en helt ny metod
    /****************Dumma metoder********************
    public static void printMe(Integer[] i){
        for(Integer x : i ){
            System.out.println(x);
        }
    }

    public static void printMe(Character[] i){
        for(Character x : i ){
            System.out.println(x);
        }
    }*/



}
