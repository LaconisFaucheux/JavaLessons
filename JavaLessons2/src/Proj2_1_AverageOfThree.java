import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        List<Double> list = new LinkedList<>();
        double listSum = 0;
        int listRange;

        System.out.println("How many numbers do you want to write?");
        listRange = keyboard.nextInt();

        for (int i = 0; i < listRange; i++){
            System.out.println("Write a number:");
            double tmp = keyboard.nextDouble();
            list.add(tmp);
        }

        for (Double aDouble : list) {
            listSum += aDouble;
        }
        System.out.println("The average of your " + listRange + " numbers is: " + (listSum / list.size()));
    }
}
