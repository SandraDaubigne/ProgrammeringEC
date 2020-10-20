package zoo;

public class Apa extends Aminal {

    //Polymorfism
    @Override
    public void eat() {
        System.out.println(Food.BANANAS + " " + Food.MEAT);
    }
}

