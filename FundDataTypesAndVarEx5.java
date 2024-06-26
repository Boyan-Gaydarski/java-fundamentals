import java.util.Scanner;

public class FundDataTypesAndVarEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end ; i++) {

//            char symbol = (char) i; - optional

            System.out.printf("%c ", i);

        }
    }
}
