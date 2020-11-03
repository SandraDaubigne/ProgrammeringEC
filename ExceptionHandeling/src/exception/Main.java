package exception;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println("Välkommen till detta programmet!");

        //Hanterar en exception
        //Exception handeling
        try {
            String[] name = {"Anna", "Johan"};
            //Unchecked Exceptions
            //Den måste inte hanteras
            System.out.println(name[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Oj du kan inte välja en person som inte finns, var vänlig försök igen");
        }finally{
            System.out.println("Hoppas du har haft det bra");
        }

        Person.file();

    }
}
