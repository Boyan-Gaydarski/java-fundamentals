import java.math.BigDecimal;
import java.util.Scanner;

public class DataAndVarTypesBigDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal sum = new BigDecimal(0);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            BigDecimal number = new BigDecimal(scanner.nextLine());

            sum = sum.add(number);
        }
        System.out.println(sum);
    }
}
