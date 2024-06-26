import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AsocArraysEx2Mining {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();


        // My Solution

//        String command = scanner.nextLine();
//
//
//        while (!"stop".equals(command)) {
//
//           String typeOfResource = command;
//
//            command = scanner.nextLine();
//
//            if ("stop".equals(command)) {
//                break;
//            }
//
//            Integer quantity = Integer.parseInt(command);
//
//            if (resources.containsKey(typeOfResource)) {
//
//                resources.put(typeOfResource, resources.get(typeOfResource) + quantity);
//
//            } else {
//                resources.put(typeOfResource, quantity);
//            }
//
//            command = scanner.nextLine();
//        }
//        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
//
//            System.out.printf("%s -> %d%n",entry.getKey(), entry.getValue());
//        }

        String item = scanner.nextLine();
        while(!"stop".equals(item)) {
            int count = Integer.parseInt(scanner.nextLine());
            resources.putIfAbsent(item, 0);
            int newCount = resources.get(item) + count;
            resources.put(item, newCount);

            item = scanner.nextLine();
        }

        resources.forEach((k, v) -> System.out.println(String.format("%s -> %d", k, v)));
    }
}
