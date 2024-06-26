import java.util.Scanner;

public class BasicSyntaxProblem5ReversePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";

        int counter = 0;

        for (int i = username.length(); i >= 1; i--){
            char ch = username.charAt(i - 1);
            password += ch + "";

        }
        String login = scanner.nextLine();
        while (!login.equals(password)) {

            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!",username);
                break;
            }

            System.out.println("Incorrect password. Try again.");
            login = scanner.nextLine();

        } if (counter < 4) {
            System.out.printf("User %s logged in.",username);
        }

    }
}
