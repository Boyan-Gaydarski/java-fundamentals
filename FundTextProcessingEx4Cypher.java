import java.util.Scanner;

public class FundTextProcessingEx4Cypher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char current = message.charAt(i);

            encrypted.append((char) (current + 3));

        }

        System.out.println(encrypted);
    }
}
