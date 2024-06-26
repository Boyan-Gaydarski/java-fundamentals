import java.util.Scanner;

public class FundDataTypesAndVarEx10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int diminishedPower = power;

        while (diminishedPower >= distance){
            diminishedPower = diminishedPower - distance;
            if ((power / 2.0 == diminishedPower) && (exhaustionFactor != 0)) {
                diminishedPower = diminishedPower / exhaustionFactor;
            }

            counter++;
        }
        System.out.println(diminishedPower);
        System.out.println(counter);

    }
}
