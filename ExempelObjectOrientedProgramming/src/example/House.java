package example;

//En klass innan det objekt
//Vi ska skapa en ritning för objekten
//Ritningen på huset men det är inte huset.

//POJO klass - Plain Old Java Object

public class House {

    //Variabler
    private int walls;
    private String name;
    private int price;
    private int id;
    private static int idCounter =1;

    //Konstruktorn körs vid skapandet av objektet  (new) House();
    public House(int walls, String name, int price) {
        this.id = idCounter;
        idCounter +=1;

        this.walls = walls;
        this.name = name;
        this.price = price;
    }

    //getters och setters
    public int getWalls() {
        return walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    //Tostring
    //Denna kan vi ändra själva
    @Override
    public String toString() {
        return  "\n Huset har " + walls + " antal väggar " +
                "\n och har namnet: "+ name +
                "\n och kostar: " + price +
                "\n och har ett unikt id som är " + id +
                "\n";
    }
}
