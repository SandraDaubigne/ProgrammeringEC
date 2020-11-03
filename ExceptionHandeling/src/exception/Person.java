package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Person {

    public static void file() {

        //Hantera exception här inne
        try {
            FileInputStream f = new FileInputStream("");
        }catch(Exception e){

        }

        //Skicka ansvaret vidare
    }
}
