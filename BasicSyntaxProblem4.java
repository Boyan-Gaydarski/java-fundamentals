import java.util.Scanner;

public class BasicSyntaxProblem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = startingNumber; i <=lastNumber ; i++) {
            sum += i;
            System.out.print(i);
            System.out.print(" ");

        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
