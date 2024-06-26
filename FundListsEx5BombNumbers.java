import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FundListsEx5BombNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = readList(scanner);


        String[] tokens = scanner.nextLine().split("\\s+");

        int bombNumber = Integer.parseInt(tokens[0]);
        int power = Integer.parseInt(tokens[1]);


        while (list.contains(bombNumber)) {

            int index = list.indexOf(bombNumber);

            int leftBound = Math.max(index - power, 0);
            int rightBound = Math.min(index + power, list.size() - 1);
            for (int i = rightBound; i >= leftBound; i--) {
                list.remove(i);

            }
        }

        int sum = sumList(list);
        System.out.println(sum);
    }

    private static int sumList(List<Integer> list) {
        int result = 0;
        for (Integer integer : list) {
            result += integer;

        }
        return result;
    }

    private static List<Integer> readList(Scanner scanner) {

        String[] input = scanner.nextLine().split("\\s+");

        List<Integer> list = new ArrayList<>();

        for (String element : input) {

            list.add(Integer.parseInt(element));

        }


        return list;


    }
}
