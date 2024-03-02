import java.util.Scanner;

public class MyFunction {

    public static void main(String[] args) {
        String name = takeInput();
        String personName = toUppercase(name);
        String helloName = sayHello(personName);

        System.out.println(helloName);
    }

    private static String takeInput() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name: ");
        return myObj.nextLine();
    }

    private static String toUppercase(String name) {
        return name.toUpperCase();
    }

    private static String sayHello(String name) {
        return "Hello ".concat(name);
    }
}
