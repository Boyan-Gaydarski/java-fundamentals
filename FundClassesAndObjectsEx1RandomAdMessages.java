import java.util.Random;
import java.util.Scanner;

public class FundClassesAndObjectsEx1RandomAdMessages {
    public static void main(String[] args) {

        String[] phrases = new String[]{"Excellent product.", "Such a great product.", "I always use this product.",
                                        "Best product of its category.", "Exceptional product.", "I can't live without this product."};
        String[] events = new String[]{"Now I feel good.", "I have succeeded with this product.", "Works miracles. I am happy with the results",
                                        "I can't believe it but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great."};
        String[] authors = new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Scanner scanner = new Scanner(System.in);

        int messages = Integer.parseInt(scanner.nextLine());

        Random random = new Random();

        for (int i = 0; i < messages; i++) {

            String phrase = phrases[random.nextInt(phrases.length)];
            String event = events[random.nextInt(events.length)];
            String author = authors[random.nextInt(authors.length)];
            String city = cities[random.nextInt(cities.length)];

            System.out.printf("%s %s %s - %s%n", phrase, event, author, city);
        }
    }
}
