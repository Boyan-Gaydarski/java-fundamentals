package OrderByAge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        String input = scanner.nextLine();


        while (!"End".equals(input)) {

            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            String id = tokens[1];
            int age = Integer.parseInt(tokens[2]);

            Person person = new Person(name, id, age);

            people.add(person);

            input = scanner.nextLine();


        }

        people.stream().sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())).forEach(p -> System.out.println(p));
    }
}
