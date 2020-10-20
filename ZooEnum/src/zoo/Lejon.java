package zoo;

public class Lejon {

    Food food;

    public Lejon(Food food) {
        this.food = food;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public void seeWhatAnimalEat(){
        System.out.println("Lions eat: " + getFood());
    }

}
