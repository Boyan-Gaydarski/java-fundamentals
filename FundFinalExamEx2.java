import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FundFinalExamEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "!(?<command>[A-Z][a-z]{2,})!:\\[(?<message>[A-Za-z]{8,})\\]";

        int n = Integer.parseInt(scanner.nextLine());


        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {

            String message = scanner.nextLine();

            Matcher matcher = pattern.matcher(message);

            if (matcher.find()) {

                String command = matcher.group("command");
                String hiddenMessage = matcher.group("message");

                StringBuilder sb = new StringBuilder();
                sb.append(command);
                sb.append(": ");

                int[] encrypt = new int[hiddenMessage.length()];

                for (int j = 0; j < hiddenMessage.length(); j++) {
                    encrypt[j] = hiddenMessage.charAt(j);
                    sb.append(encrypt[j]);
                    if (j < hiddenMessage.length() - 1) {
                        sb.append(" ");
                    }
                }

                System.out.println(sb);

            } else {
                System.out.println("The message is invalid");
            }
        }

    }
}
