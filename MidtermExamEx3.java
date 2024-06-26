import java.util.Scanner;

public class MidtermExamEx3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] pirateShipData = scanner.nextLine().split(">");
        String[] warshipData = scanner.nextLine().split(">");
        int maxSectionHealth = Integer.parseInt(scanner.nextLine());

        int[] pirateShip = new int[pirateShipData.length];
        int[] warship = new int[warshipData.length];

        for (int i = 0; i < pirateShipData.length; i++) {
            pirateShip[i] = Integer.parseInt(pirateShipData[i]);

        }

        for (int i = 0; i < warshipData.length; i++) {
            warship[i] = Integer.parseInt(warshipData[i]);

        }

        String input = scanner.nextLine();

        boolean isSunk = false;

        while (!"Retire".equals(input)) {

            String[] tokens = input.split(" ");
            String command = tokens[0];

            int damage;
            int index;
            switch (command){


                case "Fire" :
                    index = Integer.parseInt(tokens[1]);
                    damage = Integer.parseInt(tokens[2]);

                    if (index >= 0 && index <= warship.length - 1) {
                        warship[index] = warship[index] - damage;
                        if (warship[index] <= 0) {
                            System.out.println("You won! The enemy ship has sunk.");

                            isSunk = true;

                        }

                    }

                    break;
                case "Defend" :
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    damage = Integer.parseInt(tokens[3]);

                    if (startIndex >= 0 && startIndex <= pirateShip.length - 1) {
                        if (endIndex >= 0 && endIndex <= pirateShip.length - 1) {
                            for (int i = startIndex; i <= endIndex ; i++) {
                                pirateShip[i] = pirateShip[i] - damage;
                                if (pirateShip[i] <= 0) {
                                    System.out.println("You lost! The pirate ship has sunk.");
                                    isSunk = true;
                                    break;
                                }

                            }

                        }
                    }

                    break;
                case "Repair" :
                    index = Integer.parseInt(tokens[1]);
                    int health = Integer.parseInt(tokens[2]);

                    if (index >= 0 && index <= pirateShip.length - 1) {
                        pirateShip[index] = pirateShip[index] + health;
                        if (pirateShip[index] > maxSectionHealth) {
                            pirateShip[index] = maxSectionHealth;
                        }

                    }

                    break;
                case "Status" :

                    double repairNeeded = maxSectionHealth * 0.2;
                    int count = 0;

                    for (int i = 0; i < pirateShip.length; i++) {
                        if (pirateShip[i] < repairNeeded) {

                            count++;
                        }
                    }
                    System.out.printf("%d sections need repair.", count);
                    break;
            }

            if (isSunk) {
                break;
            }

            input = scanner.nextLine();
        }
        if (!isSunk) {
            int pirateShipSum = 0;
            int warshipSum = 0;

            for (int i = 0; i < pirateShip.length; i++) {
                pirateShipSum += pirateShip[i];
            }

            for (int i = 0; i < warship.length; i++) {
                warshipSum += warship[i];
            }
            System.out.printf("Pirate ship status: %d%n", pirateShipSum);
            System.out.printf("Warship status: %d", warshipSum);
        }
    }
}
