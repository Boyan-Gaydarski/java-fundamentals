import java.util.Scanner;

public class FundMethodsEx2VowelsCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        
        int count = vowelCount(input);
        System.out.println(count);

    }

    private static int vowelCount(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {

            switch (input.charAt(i)) {
                case 65:
                case 69:
                case 111:
                case 85:
                case 73:
                case 79:
                case 97:
                case 101:
                case 105:
                case 117:
                    count++;
                    break;
            }

        }
        return count;


    }
}
