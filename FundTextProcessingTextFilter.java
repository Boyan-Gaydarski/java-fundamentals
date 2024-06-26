import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FundTextProcessingTextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();


        for (String bannedWord : bannedWords) {

//            String asterisk = getAsteriskString(bannedWord, bannedWord.length());
            String asterisk = getAsteriskString(bannedWord.length());


            text = text.replace(bannedWord, asterisk);
        }

        System.out.println(text);
    }

    private static String getAsteriskString(int length) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            result.add("*");
        }
        return String.join("", result);

    }

//    private static String getAsteriskString(String asterisk, int length) {
//
//
//        for (int i = 0; i < length; i++) {
//
//            asterisk = asterisk.replace(asterisk.charAt(i), '*');
//
//
//        }
//
//        return asterisk;
//
//    }


}
