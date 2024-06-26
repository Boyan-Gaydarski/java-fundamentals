import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> students = new ArrayList<>();

        while (!"end".equals(input)) {

            String[] tokens = input.split("\\s+");

            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String hometown = tokens[3];

            Student student = new Student(firstName, lastName, age, hometown);
            students.add(student);

            input = scanner.nextLine();

        }

        String city = scanner.nextLine();

        for (Student student : students) {
            if (city.equals(student.getHometown())) {
                System.out.printf("%s %s is %d years old.%n",
                        student.getFirstName(), student.getLastName(),
                        student.getAge());

            }

        }
    }

}
