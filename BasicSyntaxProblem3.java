import java.util.Scanner;

public class BasicSyntaxProblem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfHoliday = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price;
        double totalPrice = 0.0;

        switch (dayOfWeek) {
            case "Friday":
                switch (typeOfHoliday) {
                    case "Students":
                        price = 8.45;
                        if (numberOfPeople >= 30) {
                            totalPrice = price * numberOfPeople * 0.85;
                        } else {
                            totalPrice = price * numberOfPeople;
                        }

                        break;
                    case "Business":
                        price = 10.90;
                        if (numberOfPeople >= 100) {
                            totalPrice = (price * numberOfPeople) - (price * 10);
                        } else {
                            totalPrice = price * numberOfPeople;
                        }

                        break;
                    case "Regular":
                        price = 15.0;
                        if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                            totalPrice = price * numberOfPeople * 0.95;
                        } else {
                            totalPrice = price * numberOfPeople;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (typeOfHoliday) {
                    case "Students":
                        price = 9.80;
                        if (numberOfPeople >= 30) {
                            totalPrice = price * numberOfPeople * 0.85;
                        } else {
                            totalPrice = price * numberOfPeople;
                        }

                        break;
                    case "Business":
                        price = 15.60;
                        if (numberOfPeople >= 100) {
                            totalPrice = (price * numberOfPeople) - (price * 10);
                        } else {
                            totalPrice = price * numberOfPeople;
                        }

                        break;
                    case "Regular":
                        price = 20.0;
                        if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                            totalPrice = price * numberOfPeople * 0.95;
                        } else {
                            totalPrice = price * numberOfPeople;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (typeOfHoliday) {
                    case "Students":
                        price = 10.46;
                        if (numberOfPeople >= 30) {
                            totalPrice = price * numberOfPeople * 0.85;
                        } else {
                            totalPrice = price * numberOfPeople;
                        }

                        break;
                    case "Business":
                        price = 16.0;
                        if (numberOfPeople >= 100) {
                            totalPrice = (price * numberOfPeople) - (price * 10);
                        } else {
                            totalPrice = price * numberOfPeople;
                        }

                        break;
                    case "Regular":
                        price = 22.5;
                        if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                            totalPrice = price * numberOfPeople * 0.95;
                        } else {
                            totalPrice = price * numberOfPeople;
                        }
                        break;
                }
                break;


        }
        System.out.printf("Total price: %.2f%n",totalPrice);
    }
}
