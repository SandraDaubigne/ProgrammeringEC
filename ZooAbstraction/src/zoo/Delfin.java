package zoo;

public class Delfin extends Animal{

    public Delfin(String food) {

        super.food = food;
    }

    @Override
    public void eat(){
        System.out.println("Delfinen äter: " + super.food);
    }
}
