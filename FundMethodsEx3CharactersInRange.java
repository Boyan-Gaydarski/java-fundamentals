import java.util.Scanner;

public class FundMethodsEx3CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

        if (start < end) {
            printCharacterRange(start, end);

        } else {
            printCharacterRange(end, start);
        }

    }

    private static void printCharacterRange(char start, char end) {
        for (char i = ++start; i < end ; i++) {
            System.out.printf("%c ", i);
        }
    }
}
