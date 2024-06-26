import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FundListsEx2ChangeList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = readList(scanner);

        String command = scanner.nextLine();

        while (!"end".equals(command)) {

            String[] token = command.split(" ");

            if ("Delete".equals(token[0])){
                list.removeAll(Collections.singleton(Integer.valueOf(token[1])));
            } else {
                list.add(Integer.parseInt(token[2]), Integer.valueOf(token[1]));
            }

            command = scanner.nextLine();
        }
        printList(list);


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
