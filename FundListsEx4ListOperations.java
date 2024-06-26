import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FundListsEx4ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = readList(scanner);

        String command = scanner.nextLine();

        while (!"End".equals(command)) {

            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "Add" :

                    list.add(Integer.valueOf(tokens[1]));

                    break;

                case "Insert" :

                    list.add(Integer.parseInt(tokens[2]), Integer.valueOf(tokens[1]));

                    break;

                case "Remove" :

                    if (Integer.parseInt(tokens[1]) >= list.size()) {
                        System.out.println("Invalid index");
                    } else {
                        list.remove(Integer.parseInt(tokens[1]));
                    }

                    break;

                case "Shift" :

                    switch (tokens[1]) {
                        case "left" :
                            shiftLeft(list, tokens[2]);

                            break;

                        case "right" :
                            shiftRight(list, tokens[2]);

                            break;
                    }

                    break;

            }




            command = scanner.nextLine();
        }

        printList(list);

    }

    private static void shiftRight(List<Integer> list, String token) {
        int count = Integer.parseInt(token);

        for (int i = 0; i < count; i++) {

            int current = list.get(list.size() - 1);

            for (int j = list.size() - 1; j > 0; j--) {

                list.set(j, list.get(j - 1));

            }

            list.set(0, current);

        }
    }

    private static void shiftLeft(List<Integer> list, String token) {
        int count = Integer.parseInt(token);

        for (int i = 0; i < count; i++) {

            int current = list.get(0);

            for (int j = 0; j < list.size() - 1; j++) {

                list.set(j, list.get(j + 1));

            }

            list.set(list.size() - 1, current);

        }
    }

    private static List<Integer> readList(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");

        List<Integer> list = new ArrayList<>();

        for (String element : input) {
            list.add(Integer.parseInt(element));

        }

        return list;
    }

    private static void printList(List<Integer> list) {

        for (Integer integer : list) {
            System.out.print(integer + " ");

        }
    }
}
