import java.util.Scanner;

public class FundFinalExamEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String initialMessage = scanner.nextLine();


        String input = scanner.nextLine();
        while (!"Finish".equals(input)) {

            String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (command) {

                case "Replace":
                    initialMessage = initialMessage.replace(tokens[1], tokens[2]);
                    System.out.println(initialMessage);

                    break;
                case "Cut":
                    int startCutIndex = Integer.parseInt(tokens[1]);
                    int endCutIndex = Integer.parseInt(tokens[2]);

                    if (startCutIndex >= 0 && startCutIndex <= initialMessage.length() - 1
                            && endCutIndex >= 0 && endCutIndex <= initialMessage.length() - 1) {
                        String substringSum = initialMessage.substring(startCutIndex, (endCutIndex + 1));
                        initialMessage = initialMessage.replace(substringSum, "");
                        System.out.println(initialMessage);
                    } else {
                        System.out.println("Invalid indexes!");
                    }

                    break;
                case "Make":
                    switch (tokens[1]) {
                        case "Upper":
                            initialMessage = initialMessage.toUpperCase();
                            System.out.println(initialMessage);
                            break;
                        case "Lower":
                            initialMessage = initialMessage.toLowerCase();
                            System.out.println(initialMessage);
                            break;
                    }
                    break;
                case "Check":
                    if (initialMessage.contains(tokens[1])) {
                        System.out.println(String.format("Message contains %s", tokens[1]));
                    } else {
                        System.out.println(String.format("Message doesn't contain %s", tokens[1]));

                    }
                    break;
                case "Sum":
                    int startSumIndex = Integer.parseInt(tokens[1]);
                    int endSumIndex = Integer.parseInt(tokens[2]);

                    if (startSumIndex >= 0 && startSumIndex <= initialMessage.length() - 1
                            && endSumIndex >= 0 && endSumIndex <= initialMessage.length() - 1) {
                        String substringSum = initialMessage.substring(startSumIndex, (endSumIndex + 1));
                        int sum = 0;
                        for (int i = 0; i < substringSum.length(); i++) {
                            sum += substringSum.charAt(i);

                        }
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indexes!");
                    }

                    break;
            }


            input = scanner.nextLine();
        }



    }
}
