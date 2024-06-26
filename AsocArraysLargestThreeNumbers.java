import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AsocArraysLargestThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String result = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .limit(3)
                .map(n -> n.toString())
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
