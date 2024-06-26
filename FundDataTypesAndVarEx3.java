import java.util.Scanner;

public class FundDataTypesAndVarEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());

        int courses = people / elevatorCapacity;
        if (people % elevatorCapacity != 0 ){
            courses += 1;
        }
        System.out.println(courses);
    }
}
