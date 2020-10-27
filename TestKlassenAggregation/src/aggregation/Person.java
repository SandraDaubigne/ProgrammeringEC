package aggregation;

public class Person {

    String name;

    //Aggregation innebär att jag använder en klass som medlemsvariabel

    //Referensdatatyper pekar mot objekt
    //Food food; - Enum som vi hämtade genom konstruktorn
    //String hemma; - String som en primitiv datatyp "typ"

    //Klass
    //Datatyp variablel värde(vill fylla på via konstruktorn)
    //Aggregation = vi kan använda oss av en klass som medlemsvariabel
    Attributes attributes;

    //Konstruktor körs när objektet skapas
    public Person(String name, Attributes attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
