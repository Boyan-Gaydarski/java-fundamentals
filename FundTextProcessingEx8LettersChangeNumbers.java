import java.util.Scanner;

public class FundTextProcessingEx8LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");
        double finalSum = 0.0;
        for (String word : words) {

            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length() - 1);
            String numberAsString = word.substring(1, word.length() - 1);
            long number = Integer.parseInt(numberAsString);

            double result;

            if (Character.isUpperCase(firstLetter)) {
                result = (number * 1.0) / (firstLetter - 64);
            } else {
                result = number * (firstLetter - 96);
            }

            if (Character.isUpperCase(lastLetter)) {
                result -= lastLetter - 64;
            } else {
                result += lastLetter - 96;

            }
            finalSum += result;
        }
        System.out.printf("%.2f%n", finalSum);
        
    }
}
