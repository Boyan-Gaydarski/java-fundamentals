import java.util.*;

public class FundListsOrderLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = new ArrayList<>();

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input; i++) {
            String current = scanner.nextLine();
            products.add(current);

        }
        Collections.sort(products);

        for (int i = 0; i < products.size(); i++) {

            System.out.println((i + 1) + "." + products.get(i));

        }
    }
}
