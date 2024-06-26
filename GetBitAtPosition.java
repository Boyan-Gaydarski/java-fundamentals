import java.util.Scanner;

public class GetBitAtPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int position = Integer.parseInt(scanner.nextLine());

        System.out.println((number >> position) & 1);
    }
}
