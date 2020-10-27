package aggregation;

public class Attributes {

    //Medlemsvariabler
    //Klassvariabler(static) eller instansvariabler(nonstatic)
    int shoeSize;
    String hairColor;

    //Vi har en kosntruktor som tar emot två parametrar
    //Vi hade inte behövt ha en konstruktor alls
    //Men vi ska göra nåt med dem så måste vi ha den
    public Attributes(int shoeSize, String hairColor) {
        this.shoeSize = shoeSize;
        this.hairColor = hairColor;
    }


    //Nu har vi en konstruktor som tar emot bara EN parameter
    //metodsignaturen har ändrat! Så detta är overload
    //Överladdar
    public Attributes(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "shoeSize=" + shoeSize +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
