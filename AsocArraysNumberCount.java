import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AsocArraysNumberCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");

        Map<Double, Integer> occurrences = new TreeMap<>();

        for (String part : parts) {
            Double currentNumber = Double.parseDouble(part);

            if (occurrences.containsKey(currentNumber)) {

                Integer currentCount = occurrences.get(currentNumber);

                occurrences.put(currentNumber, currentCount + 1);
            } else {
                occurrences.put(currentNumber, 1);
            }

        }
        DecimalFormat decimalFormat = new DecimalFormat("#.######");

        for (Map.Entry<Double, Integer> entry : occurrences.entrySet()) {

            System.out.printf("%s -> %d%n", decimalFormat.format(entry.getKey()), entry.getValue());
        }
    }
}
