import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FundTextProcessingRepeatStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");



        String result = "";

        for (int i = 0; i < words.length; i++) {

            result += repeatTimes(words[i], words[i].length());


        }
        System.out.println(result);


//        String streamResult = Arrays.stream(words)
//                .map(w -> repeatTimes(w, w.length()))
//                .collect(Collectors.joining());
//        System.out.println(streamResult);


//        List<String> resulted = new ArrayList<>();
//        for (String word : words) {
//            resulted.add(repeatTimes(word, word.length()));
//        }
//        System.out.println(String.join("", resulted));
    }

    private static String repeatTimes(String word, int times) {
        String result = "";

        for (int i = 0; i < times; i++) {
            result += word;
        }
        return result;
    }

}
