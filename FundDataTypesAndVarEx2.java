import java.util.Scanner;

public class FundDataTypesAndVarEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int number = Integer.parseInt(scanner.nextLine());
//        int sum = 0;
//        String numAsString = String.valueOf(number);
//
//        for (int i = 0; i < numAsString.length(); i++) {
//
//            int digit = number % 10;
//            number = number / 10;
//            sum = sum + digit;
//        }
//        System.out.println(sum);
        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (number > 0){
            int digit = number % 10;
            number /= 10;
            sum += digit;
        }
       System.out.println(sum);
    }
}
