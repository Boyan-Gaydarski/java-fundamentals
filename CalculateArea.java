import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double area = calculateArea(a, b);
        System.out.printf("%.0f%n",area);
    }

    private static double calculateArea(double a, double b) {

        return a * b;

    }
}

