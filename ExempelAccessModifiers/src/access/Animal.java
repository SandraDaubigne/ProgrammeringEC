package access;

public class Animal {

    //Skapa ett unikt id för varje objekt jag skapar
    //Bra anledning att använda static
    //IOM att den inte "åker med" vid klassinstansen

    int id;
    static int idCounter = 1;

    //Jag måste inte ha en kunstruktor
    //MEN om jag vill göra nånting i samband med att objektet skapas
    //Så är det i kosntruktorn jag gör detta.

    //Och om jag vill göra flera olika saker när objektet skapas
    //Så behöver jag ha flera konstruktorer
    //Konsruktor overloadning
    public Animal() {
        this.id = idCounter;
        idCounter +=1;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}
