import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FundRegexEx2Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");


        List<String> racers = new ArrayList<>();

        for (String racer : input) {
            racers.add(racer);

        }

        String digitRegex = "\\d";
        String letterRegex = "[A-Za-z]";

        Pattern digitPattern = Pattern.compile(digitRegex);
        Pattern letterPattern = Pattern.compile(letterRegex);

        Map<String, Integer> race = new LinkedHashMap<>();

        String inputLine = scanner.nextLine();

        while (!"end of race".equals(inputLine)) {

            StringBuilder sb = new StringBuilder();
            Matcher letterMatcher = letterPattern.matcher(inputLine);
            while (letterMatcher.find()) {
                sb.append(letterMatcher.group());
            }
            if (racers.contains(sb.toString())) {
                race.putIfAbsent(sb.toString(), 0);
                int km = race.get(sb.toString());
                Matcher digitMatcher = digitPattern.matcher(inputLine);
                while (digitMatcher.find()) {
                    km += Integer.parseInt(digitMatcher.group());
                }
                race.put(sb.toString(), km);
            }

            inputLine = scanner.nextLine();
        }

        List<String> output = new ArrayList<>();
        output.add("1st place: ");
        output.add("2nd place: ");
        output.add("3rd place: ");
        race
                .entrySet()
                .stream()
                .sorted((r1, r2) -> r2.getValue().compareTo(r1.getValue()))
                .limit(3)
                .forEach(r -> {

                 System.out.println(output.remove(0) + r.getKey());
                });
    }
}
