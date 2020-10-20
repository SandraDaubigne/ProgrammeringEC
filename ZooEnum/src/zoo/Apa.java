package zoo;

public class Apa {

    Food food;
    int retur = 10;

    public Apa(Food food) {
        this.food = food;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public void seeWhatAnimalEat(Food food) {
        System.out.println("Monkeys eat: " + food);

    }

}
