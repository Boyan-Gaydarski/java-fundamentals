import java.util.Scanner;

public class FundTextProcessingEx2CharMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = input[1];

        int max = Math.max(a.length(), b.length());
        int min = Math.min(a.length(), b.length());

        int result = 0;

        for (int i = 0; i < max; i++) {

            if (i < min) {
                result += a.charAt(i) * b.charAt(i);
            } else if (a.length() == max) {
                result += a.charAt(i);
            } else {
                result += b.charAt(i);
            }
        }

        System.out.println(result);
    }

}

