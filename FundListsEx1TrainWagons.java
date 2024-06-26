import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FundListsEx1TrainWagons {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] wagons = scanner.nextLine().split(" ");

        List<Integer> trainWagons = new ArrayList<>();

        for (String wagon : wagons) {
            trainWagons.add(Integer.parseInt(wagon));


        }

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] token = command.split(" ");

            if (token[0].equals("Add")) {
                int newWagon = Integer.parseInt(token[1]);
                trainWagons.add(newWagon);

            } else {
                int newPassengers = Integer.parseInt(token[0]);

                for (int i = 0; i < trainWagons.size(); i++) {

                    int total = trainWagons.get(i) + newPassengers;

                    if (total <= maxCapacity) {

                        trainWagons.set(i, total);
                        break;
                    }

                }
            }


            command = scanner.nextLine();
        }
        for (Integer trainWagon : trainWagons) {
            System.out.print(trainWagon + " ");

        }
    }
}
