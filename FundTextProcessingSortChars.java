import java.util.Scanner;

public class FundTextProcessingSortChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder chars = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            char token = input.charAt(i);

            if (Character.isDigit(token)) {
                digits.append(token);
            } else if (Character.isAlphabetic(token)) {
                letters.append(token);
            } else {
                chars.append(token);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(chars);
    }
}
