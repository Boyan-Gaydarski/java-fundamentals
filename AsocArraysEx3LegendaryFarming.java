import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class AsocArraysEx3LegendaryFarming {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyResources = new LinkedHashMap<>();
        keyResources.put("shards", 0);
        keyResources.put("fragments", 0);
        keyResources.put("motes", 0);
        Map<String, Integer> junk = new LinkedHashMap<>();
        boolean isObtained = false;
        while (!isObtained) {
            String[] tokens = scanner.nextLine().split("\\s+");

            for (int i = 0; i < tokens.length; i += 2) {
                String resource = tokens[i + 1].toLowerCase();
                int quantity = Integer.parseInt(tokens[i]);

                if (keyResources.containsKey(resource)) {
                    addToMap(keyResources, resource, quantity);

                    isObtained = isObtained(keyResources, resource);
                    if (isObtained) {
                        break;
                    }
                } else {
                    addToMap(junk, resource, quantity);
                }
            }
        }

        keyResources
                .entrySet()
                .stream()
                .sorted((n1, n2) -> {
                    int result = n2.getValue().compareTo(n1.getValue());
                    if (result == 0) {
                        result = n1.getKey().compareTo(n2.getKey());
                    }
                    return result;
                })
                .forEach(i -> System.out.println(String.format("%s: %d", i.getKey(), i.getValue())));
        junk
                .entrySet()
                .stream()
                .sorted((n1, n2) -> n1.getKey().compareTo(n2.getKey()))
                .forEach(i -> System.out.println(String.format("%s: %d", i.getKey(), i.getValue())));
    }


    private static boolean isObtained(Map<String, Integer> map, String resource) {
        if (map.get(resource) >= 250) {
            int newQuantity = map.get(resource) - 250;
            map.put(resource, newQuantity);

            switch (resource) {
                case "shards":
                    System.out.println("Shadowmourne obtained!");
                    break;
                case "fragments":
                    System.out.println("Valanyr obtained!");
                    break;
                case "motes":
                    System.out.println("Dragonwrath obtained!");
                    break;
            }
            return true;
        }
        return false;
    }

    private static void addToMap(Map<String, Integer> map, String resource, int quantity) {
        map.putIfAbsent(resource, 0);
        int newQuantity = map.get(resource) + quantity;
        map.put(resource, newQuantity);
    }
}
