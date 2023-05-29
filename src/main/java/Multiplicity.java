import java.util.Scanner;

public class Multiplicity {
    private static final String SPLIT_SYMBOL = " ";
    private static final int DIVIDER = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = convertStringArrayToInt(readStringArray(scanner));
        findMultiples(array);
    }

    private static String[] readStringArray(Scanner scanner) {
        String input = scanner.nextLine();
        return input.split(SPLIT_SYMBOL);
    }

    private static int[] convertStringArrayToInt(String[] numbers) {
        int[] array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }
        return array;
    }

    private static void findMultiples(int[] array) {
        for (int i : array) {
            if (i % DIVIDER == 0) {
                System.out.println(i);
            }
        }
    }
}
