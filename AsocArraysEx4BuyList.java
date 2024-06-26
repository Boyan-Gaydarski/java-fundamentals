import java.util.*;

public class AsocArraysEx4BuyList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> quantityMap = new LinkedHashMap<>();
        Map<String, Double> priceMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!"buy".equals(input)) {

            String[] tokens = input.split("\\s+");
            String product = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            priceMap.put(product, price);

            quantityMap.putIfAbsent(product, 0);
            int newQuantity = quantityMap.get(product) + quantity;
            quantityMap.put(product, newQuantity);

            input = scanner.nextLine();
        }

        quantityMap.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v * priceMap.get(k)));
    }
}

