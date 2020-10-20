package zoo;

public class Main {

    public static void main(String[] args) {

        Lejon lejon = new Lejon(Food.MEAT);
        lejon.seeWhatAnimalEat();

        Apa apa = new Apa(Food.BANANAS);
        apa.seeWhatAnimalEat(Food.MEAT);

    }


}
