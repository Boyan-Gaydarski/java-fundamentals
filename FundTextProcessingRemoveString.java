import java.util.Scanner;

public class FundTextProcessingRemoveString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String removableString = scanner.nextLine();
        String fullString = scanner.nextLine();

        int indexOfToken = fullString.indexOf(removableString);

        while (indexOfToken >= 0) {

            fullString = fullString.substring(0, indexOfToken) +
                    fullString.substring(indexOfToken + removableString.length());

            indexOfToken = fullString.indexOf(removableString);
        }

//        while (fullString.contains(removableString)) {
//            fullString = fullString.replace(removableString, "");
//        }

        System.out.println(fullString);
    }
}
