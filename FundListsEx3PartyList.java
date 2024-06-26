import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FundListsEx3PartyList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfGuests = Integer.parseInt(scanner.nextLine());


        List<String> guests = new ArrayList<>();

        for (int i = 0; i < numberOfGuests; i++) {

            String[] tokens = scanner.nextLine().split("\\s+", 2);
            String name = tokens[0];

            if ("is going!".equals(tokens[1])) {
                if (guests.contains(name)) {
                    System.out.printf("%s is already on the list!%n", name);

                } else {
                    guests.add(name);
                }
            } else if ("is not going!".equals(tokens[1])) {
                if (guests.contains(name)) {
                    guests.remove(name);

                } else {
                    System.out.printf("%s is not on the list!%n", name);
                }
            }
        }
        for (String guest : guests) {

            System.out.println(guest);
        }
    }
}
