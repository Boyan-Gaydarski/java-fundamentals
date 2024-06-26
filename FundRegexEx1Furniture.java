import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FundRegexEx1Furniture {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<item>[A-Za-z]+)<<(?<price>\\d+\\.?\\d+)!(?<quantity>\\d+)";

        String command = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);

        List<String> items = new LinkedList<>();
        double finalPrice = 0.0;


        while (!"Purchase".equals(command)) {

            Matcher matcher = pattern.matcher(command);
            if (matcher.find()) {
                String name = matcher.group("item");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                items.add(name);
                finalPrice += price * quantity;
            }


            command = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        items.forEach(e -> System.out.println(e));
        System.out.printf("Total money spent: %.2f", finalPrice);
    }
}
