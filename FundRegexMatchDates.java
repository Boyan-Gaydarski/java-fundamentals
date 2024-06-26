import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FundRegexMatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\b(?<day>[0123][0-9])([./-])(?<month>[A-Z][a-z]{2})\\2(?<year>[0-9]{4})\\b";

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) {

            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
    }
}
