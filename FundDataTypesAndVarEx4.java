import java.util.Scanner;

public class FundDataTypesAndVarEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int symbol = scanner.nextLine().charAt(0);
            sum = sum + symbol;
            
        }
        System.out.printf("Total sum = %d%n", sum);

    }
}

