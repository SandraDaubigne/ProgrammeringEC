package method;

public class Method {

    //En metod utan returvärde och utan parameter
    public void method1(){
        System.out.println("Hej! Jag är metod 1");
    }

    //En metod med returvärde utan parameter
    public String method2(){
        String method2 = "Im method 2";
        return method2;
    }

    //En metod utan returvärde med parameter
    public void method3(String input){
        String method3 = input;
        System.out.println(method3);
    }

    //En metod med returvärde och parameter
    public String method4(String input){
        String method4 = input;
        return method4;
    }


}
