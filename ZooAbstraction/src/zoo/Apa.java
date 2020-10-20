package zoo;

public class Apa extends Animal{

    public Apa(String food) {
        super.food = food;
    }

    @Override
    public void eat(){
        System.out.println("Apan äter: " + super.food);
    }
}
