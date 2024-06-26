import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FundRegexEx3BarTab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "%(?<customer>[A-z][a-z]+)%[^|$%.]*?<(?<product>\\w+)>[^|$%.]*?\\|[^|$%.]*?(?<quantity>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d+)\\$";

        Pattern pattern = Pattern.compile(regex);

        double income = 0.0;

        while (!"end of shift".equals(input)) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {

                String customer = matcher.group("customer");
                String product = matcher.group("product");

                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                double total = quantity * price;

                income += total;

                System.out.println(String.format("%s: %s - %.2f", customer, product, total));

            }

            input = scanner.nextLine();
        }

        System.out.println(String.format("Total income: %.2f", income));
    }
}
