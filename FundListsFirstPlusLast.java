import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FundListsFirstPlusLast {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (String part : input) {
            int number = Integer.parseInt(part);

            numbers.add(number);

        }
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                break;
            }
            int lastElement = numbers.get(numbers.size() - 1);
            int currentElement = numbers.get(i);

            numbers.set(i, currentElement + lastElement);
            numbers.remove(numbers.size() - 1);


        }
        for (int number : numbers) {

            System.out.print(number + " ");
        }
    }
}
