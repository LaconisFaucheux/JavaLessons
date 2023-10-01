import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter an adjective: ");
        String adj1 = keyboard.nextLine();

        System.out.println("Enter a girl's name: ");
        String girlsName = keyboard.nextLine();

        System.out.println("Enter an adjective: ");
        String adj2 = keyboard.nextLine();

        System.out.println("Enter an occupation: ");
        String occupation = keyboard.nextLine();

        System.out.println("Enter a place name:");
        String place = keyboard.nextLine();

        System.out.println("Enter a piece of clothing name");
        String clothing = keyboard.nextLine();

        System.out.println("Enter a hobby: ");
        String hobby = keyboard.nextLine();

        System.out.println("Enter an adjective: ");
        String adj3 = keyboard.nextLine();

        System.out.println("Enter an occupation: ");
        String occupation2 = keyboard.nextLine();

        System.out.println("Enter a boy's name: ");
        String boyName = keyboard.nextLine();

        System.out.println("Enter a man's name: ");
        String manName = keyboard.nextLine();

        System.out.println("There once was a " + adj1 + " girl named " + girlsName + ", who was a " + adj2 + " " + occupation
        + " in the kingdom of " + place +". She loved to wear " + clothing + " and to " + hobby + ". She wanted to marry the "
        + adj3 + " " + occupation2 + " named " + boyName + " but her father, King " + manName + ", forbid her from seeing him.");
    }
}
