import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameComparator {
    private static final String NAME = "Вячеслав";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String enteredName = br.readLine();
        System.out.println(greetingByName(enteredName));
    }

    private static String greetingByName(String enteredName) {
        if (enteredName.equalsIgnoreCase(NAME)) {
            return "Привет, " + NAME;
        }
        return "Нет такого имени";
    }
}
