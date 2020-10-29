package access;

public class Main {

    //Mainmetoden
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);

        /*
        //Jag skapar ett objekt av klassen Person
        //Referensvariabeln "person" håller adressen till objektet
        //Objekt lagras i Heap i datorn och inte i stacken som primitiva datayper gör
        //Klassinstansen
        Person person = new Person();

        //Sout är en metod och den kan inte användas utanför en annan metod
        //Hämtat en publik variabel genom klassinstansen
        //med referensvariabeln person
        //Jag kan hämta alla variabler som är publika
        System.out.println(person.age);

        //Jag kan anropa en metod från en annan klass
        //genom klassintstansen med referensvariabel person
        //Och då kan jag också hämta alla metoder som är publika
        person.check();

        Person.getMe();

        System.out.println(Person.aged);

        //jag ska hämta en static variabel
        //Då måste jag hämta klassnamnet
        System.out.println("Apan äter " + Food.BANANAS);
*/

    }



}
