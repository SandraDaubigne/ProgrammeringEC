package exercise;

public class Order {

    private String name;
    private String coffee;

    public Order(String name, String coffee) {
        this.name = name;
        this.coffee = coffee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoffee() {
        return coffee;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", coffee='" + coffee + '\'' +
                '}';
    }



    public String scannerCoffee(){

        return "Skriv detta på kaffet";
    }

    public String scannerRegisterName(){

        return "Namn";
    }

    /*
    public Order addOrder(){

        return Order;
    }*/
}
