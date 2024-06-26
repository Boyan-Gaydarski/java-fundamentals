import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        getGrade(input);


    }
    public static void getGrade(double grade) {
        String wordGrade = "Fail";
        if (grade >= 3.00 && grade <= 3.49) {
            wordGrade = "Poor";
        } else if (grade >= 3.50 && grade <= 4.49) {
            wordGrade = "Good";
        } else if (grade >= 4.50 && grade <= 5.49) {
            wordGrade = "Very good";
        } else if (grade >= 5.50 && grade <= 6.00) {
            wordGrade = "Excellent";
        }
        System.out.println(wordGrade);
    }
}

