import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FundListsListManipulation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        List<Integer> list = new ArrayList<>();

        for (String part : input) {
            int current = Integer.parseInt(part);

            list.add(current);

        }

        String command = scanner.nextLine();

        while (!"end".equals(command)) {

            String[] token = command.split(" ");

            switch (token[0]) {
                case "Add":

                    list.add(Integer.valueOf(token[1]));
                    break;

                case "Remove":

                    list.remove(Integer.valueOf(token[1]));
                    break;

                case "RemoveAt":

                    list.remove(Integer.parseInt(token[1]));
                    break;
                case "Insert":

                    list.add(Integer.parseInt(token[2]), Integer.valueOf(token[1]));
                    break;
            }


            command = scanner.nextLine();
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
