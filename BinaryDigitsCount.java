import java.util.Scanner;

public class BinaryDigitsCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int count = 0;

        while (n > 0) {
            if (n % 2 == b) {

                count++;
            }


            n = n / 2;
        }
        System.out.println(count);
    }
}
