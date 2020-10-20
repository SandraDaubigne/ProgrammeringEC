package zoo;

public class Lejon {


    String food;

    public Lejon(String food) {

        this.food = food;
    }

    public String getFood() {

        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void eat(){

        System.out.println("Lejonet äter: " + getFood());
    }
}
