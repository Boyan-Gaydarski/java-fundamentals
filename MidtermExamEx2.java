import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MidtermExamEx2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] initialTreasureChest = scanner.nextLine().split("\\|");

        List<String> treasureChest = new ArrayList<>();

        for (String s : initialTreasureChest) {

            treasureChest.add(s);

        }

        String input = scanner.nextLine();

        while (!"Yohoho!".equals(input)) {

            String[] tokens = input.split("\\s+");

            String command = tokens[0];

            switch (command) {

                case "Loot":

                    for (int i = 1; i < tokens.length; i++) {
                        if (!treasureChest.contains(tokens[i])) {
                            treasureChest.add(0, tokens[i]);
                        }

                    }

                    break;

                case "Drop":

                    String object = treasureChest.get(Integer.parseInt(tokens[1]));
                    treasureChest.remove(Integer.parseInt(tokens[1]));
                    treasureChest.add(object);

                    break;

                case "Steal":

                    List<String> stolenItems = new ArrayList<>();

                    for (int i = 0; i < Integer.parseInt(tokens[1]); i++) {

                        if (treasureChest.size() == 0) {

                            break;
                        }

                        String item = treasureChest.get(treasureChest.size() - 1);
                        stolenItems.add(0, item);

                        treasureChest.remove(treasureChest.size() - 1);


                    }
                    for (int i = 0; i < stolenItems.size(); i++) {
                        String item = stolenItems.get(i);
                        if (i == stolenItems.size() - 1) {
                            System.out.print(item);
                        } else {
                            System.out.print(item + ", ");

                        }

                    }

                    break;
            }

            input = scanner.nextLine();
        }
        String characters = "";
        for (String s : treasureChest) {

            characters = characters + s;
        }

        int length = characters.length();
        int numOfTreasures = treasureChest.size();
        double average = 1.0 * length / numOfTreasures;



        if (treasureChest.isEmpty()) {
            System.out.println("Failed treasure hunt.");

        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.", average);
        }

    }

}

