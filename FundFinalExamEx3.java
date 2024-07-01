import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class FundFinalExamEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> guestList = new LinkedHashMap<>();

        int unlikedMeals = 0;


        while (!"Stop".equals(input)) {

            String[] tokens = input.split("-");

            String like = tokens[0];
            String guestName = tokens[1];
            String meal = tokens[2];

            switch (like) {
                case "Like":
                    guestList.putIfAbsent(guestName, new ArrayList<>());
                    if (!guestList.get(guestName).contains(meal)) {
                        guestList.get(guestName).add(meal);
                    }


                    break;
                case "Unlike":
                    if (guestList.containsKey(guestName)) {

                        if (guestList.get(guestName).contains(meal)) {
                            guestList.get(guestName).remove(meal);
                            unlikedMeals++;

                            System.out.println(String.format("%s doesn't like the %s.", guestName, meal));
                        } else {
                            System.out.println(String.format("%s doesn't have the %s in his/her collection.", guestName, meal));

                        }
                    } else {
                        System.out.println(String.format("%s is not at the party.", guestName));
                    }


                    break;
            }


            input = scanner.nextLine();
        }
        guestList.entrySet().stream().sorted((left, right) -> {
            int res = right.getValue().size() - left.getValue().size();
            if (res == 0) {
                return left.getKey().compareTo(right.getKey());
            } else {
                return res;
            }
        }).forEach(e -> System.out.println(e.getKey() + ": " + printList(e.getValue())));
        System.out.println(String.format("Unliked meals: %d", unlikedMeals));
    }

    private static String printList(List<String> value) {
        return value.toString().replaceAll("[\\[\\]]", "");
    }
}