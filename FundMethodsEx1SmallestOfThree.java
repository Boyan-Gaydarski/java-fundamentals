import java.util.Scanner;

public class FundMethodsEx1SmallestOfThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int smallest = smallestOfThree(a, b, c);
        System.out.println(smallest);
    }

    private static int smallestOfThree(int a, int b, int c) {

        int smallest = a;
        if (b < a) {
            smallest = b;
        }
        if (c < b && c < a) {
            smallest = c;
        }
        return smallest;
    }
}
