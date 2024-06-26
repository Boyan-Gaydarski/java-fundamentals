import java.util.Scanner;

public class FundDataTypesAndVarEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //  first letter
        for (char i = 'a'; i < 'a' + n; i++) {
            //  second letter
            for (char j = 'a'; j < 'a' + n; j++) {
                // third letter
                for (char k = 'a'; k < 'a' + n; k++) {
                    System.out.printf("%c%c%c%n", i, j, k);

                }

            }

        }
    }
}
