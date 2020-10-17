package Djur;

public class Apa {

    private int age = 12; //Datahiding gömmer variabeln från andra klasser
    private String hair = "Brown";


    public void setHair(String hair) {
        this.hair = hair;
    }

    //Setter
    //Metod
    public void setAge(int age) {
        this.age = age;
    }

    //Getter
    //Metod
    public int getAge() {
        return age;
    }

    public String getHair() {
        return hair;
    }



}
