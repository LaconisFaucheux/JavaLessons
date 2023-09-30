public class ArithmeticFun{
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        int result = a + b;
        int diff = a - b;
        int product = a * b;
        double quotient = (double)b / a;
        int modulo = a % b;

        System.out.println("Result is " + result);
        System.out.println("Difference is " + diff);
        System.out.println("Product is " + product);
        System.out.println("Quotient is " + quotient);
        System.out.println("Modulo is " + modulo);

        result += 20;
        System.out.println("Result is now " + result);
    }
}
