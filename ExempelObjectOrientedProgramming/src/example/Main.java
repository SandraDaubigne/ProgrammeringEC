package example;

//Lånat boken
import java.util.ArrayList;

public class Main {

    //Skapa ett objekt av klassen House

    public static void main(String[] args) {

        //Vi har tre objekt av klassen House
        House house = new House(4, "Öckeröhuset", 200000);
        House tempel = new House(6, "Tjörnhuset", 400000);
        House hood = new House(8, "Skogshuset", 100000);


        //Skapa en arrayList som håller alla objekten av klassen House
        //Arraylist är också ett objekt av klassen ArrayList MEN som nån annan har skapat
        //Låna den
        ArrayList<House> houseList = new ArrayList<House>();


        //Vi har lagt till alla objekten av klassen house in i arrayListan
       houseList.add(house);
       houseList.add(tempel);
       houseList.add(hood);

       //Vi ska lägga till objekten i listan när vi skapar dem

        houseList.add(new House(8, "Skogshuset", 100000));

       //Skriva ut listan
        System.out.println(houseList);

    }

}
