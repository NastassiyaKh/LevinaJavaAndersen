import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberComparator {
    private static final int NUMBER = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(printHello(scanner.nextInt()));
        } catch (InputMismatchException e) {
            System.out.println("Please enter integer");
        }
    }

    private static String printHello(int i) {
        if (i > NUMBER) {
            return "Привет";
        }
        return "The entered number doesn't match the requirement, please enter a number greater than " + NUMBER;
    }
}
