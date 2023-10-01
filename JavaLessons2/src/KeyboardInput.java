import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double number;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("What is your age?");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter a number between 0 and 1000:");
        number = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("What city do you live in?");
        city = keyboard.nextLine();

        System.out.println("Hello " + name + ", your age is " + age + ", you live in " + city);
        System.out.println("Your number is " + number + ", and if we multiply it by 2, we get " + (number * 2));

    }
}
