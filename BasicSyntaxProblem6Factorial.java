import java.util.Scanner;

public class BasicSyntaxProblem6Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();

        int factorialSum = 0;

        for (int i = 0; i < num.length(); i++) {

            int digit = Integer.parseInt("" + num.charAt(i));

            int factorial = 1;
            for (int j = 1; j <= digit; j++) {
                factorial *= j;
            }

            factorialSum += factorial;
        }

        int number = Integer.parseInt(num);

        if (number == factorialSum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
