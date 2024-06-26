import java.util.Scanner;

public class BasicSyntaxProblem9Padawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double sabrePrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double totalSabersNeeded = Math.ceil(students * 1.1);
        int freeBelts = students / 6;

        double totalSaberPrice = sabrePrice * totalSabersNeeded;
        double totalRobePrice = robePrice * students;
        double totalBeltPrice = (beltPrice * students) - (beltPrice * freeBelts);

        double totalPrice = totalBeltPrice + totalSaberPrice + totalRobePrice;

        if (totalPrice <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", (totalPrice - money));
        }
    }
}
