package method;

public class Main {

    public static void main(String[] args) {
        Method method = new Method();

        //Method1
        method.method1();

        //Method2
        String retunes = method.method2();
        System.out.println(retunes);

        //Method3
        method.method3("Im method 3");


        //Method 4
        String method4 = method.method4("Im method 4");
        System.out.println(method4);
    }
}
