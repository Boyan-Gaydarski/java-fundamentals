import java.util.Scanner;

public class FundTextProcessingExamTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String codedMessage = scanner.nextLine();

        String input = scanner.nextLine();

        while (!"Reveal".equals(input)) {

            String[] tokens = input.split(":\\|:");
            String command = tokens[0];

            switch (command) {
                case "ChangeAll" :
                    codedMessage = codedMessage.replace(tokens[1], tokens[2]);
                    System.out.println(codedMessage);

                    break;
                case "Reverse" :
                    String reversed = new StringBuilder(tokens[1]).reverse().toString();
                    if (codedMessage.contains(tokens[1])) {
                        codedMessage = codedMessage.replace(tokens[1], reversed);
                        System.out.println(codedMessage);
                    } else {
                        System.out.println("error");
                    }

                    break;
                case "InsertSpace" :
                    codedMessage = new StringBuilder(codedMessage).insert(Integer.parseInt(tokens[1]), " ").toString();
                    System.out.println(codedMessage);

                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println(String.format("You have a new text message : %s",codedMessage));

    }
}
