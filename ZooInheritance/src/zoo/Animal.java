package zoo;

//superklass
public class Animal {

    String food;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    //Generalisering
    public void eat(){
        System.out.println("Djuret äter: " + getFood());
    }
}
