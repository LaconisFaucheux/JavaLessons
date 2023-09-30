import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("What is your age?");
        age = keyboard.nextInt();
        keyboard.nextLine();//trick pour le stream du Scanner

        System.out.println("What city do you live in?");
        city = keyboard.nextLine();

        System.out.println("Hello " + name + " and your age is " + age + ", you live in " + city);

    }
}
