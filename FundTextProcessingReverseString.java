import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FundTextProcessingReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!"end".equals(input)) {
            String reversed = new StringBuilder(input).reverse().toString();

            System.out.printf("%s = %s%n", input, reversed);

            input = scanner.nextLine();
        }
    }
}


//        while (!"end".equals(input)) {
//
//            String reversed = "";
//
//            for (int i = 0; i < input.length(); i++) {
//
//                char temp = input.charAt(input.length() - 1 - i);
//
//                reversed += temp;
//
//
//            }
//
//            System.out.printf("%s = %s%n", input, reversed);
//
//            input = scanner.nextLine();
//        }


//        while (!"end".equals(input)) {
//            String reversed = reverseList(input);
//
//            System.out.printf("%s = %s%n", input, reversed);
//
//            input = scanner.nextLine();
//        }
//    }
//
//    private static String reverseList(String input) {
//        List<String> result = new ArrayList<>();
//        for (int i = 0; i < input.length(); i++) {
//            result.add("" + input.charAt(i));
//        }
//
//        Collections.reverse(result);
//
//        return String.join("", result);
//    }
//}
