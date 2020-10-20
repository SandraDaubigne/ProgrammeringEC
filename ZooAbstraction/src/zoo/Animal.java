package zoo;

public abstract class Animal {

    String food;

    public String getFood() {

        return food;
    }

    public void setFood(String food) {

        this.food = food;
    }

    //Abstrakt metod
    //Utan kropp - inte färdigställda
    //Tvingar subklasserna att implementera dessa - färdigställa
    abstract public void eat();

}
