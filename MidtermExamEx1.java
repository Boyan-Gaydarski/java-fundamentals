import java.util.Scanner;

public class MidtermExamEx1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double targetPlunder = Double.parseDouble(scanner.nextLine());

        double totalPlunder = 0.0;

        for (int i = 1; i <= days; i++) {

            totalPlunder = totalPlunder + dailyPlunder;

            if (i % 3 == 0) {

                totalPlunder = totalPlunder + dailyPlunder * 0.5;

            }

            if (i % 5 == 0) {

                totalPlunder = totalPlunder * 0.7;
            }
            
        }
        double percentageOfTargetPlunder = totalPlunder / targetPlunder * 100;

        if(totalPlunder >= targetPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", percentageOfTargetPlunder);
        }
    }
}
