package Djur;

public class Katt {

    //vad ska katten ha för egenskaper
    private int claws; //Global variabel
    private String furColor;


    //Sätta värdet med kontruktorn
    public Katt(int claws, String furColor) {
        this.claws = claws;
        this.furColor = furColor;
    }

    //Getter
    public int getClaws() {
        return claws;
    }

    public void setClaws(int claws) {
        this.claws = claws;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }


    //Jag har frigör mig från objektet
    //Jag finns till utan objekt
    //Jag tillhör klassen
    public static void exampleStatic(){
        System.out.println("Hej Static");
    }



    public void seeScope(){
        int hello = 3; //Lokal variabel
    }



}
