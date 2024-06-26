import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FundListsMergeLists {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//          MY SOLUTION
//
//        String[] first = scanner.nextLine().split(" ");
//        String[] second = scanner.nextLine().split(" ");
//
//        List<Integer> firstList = new ArrayList<>();
//        List<Integer> secondList = new ArrayList<>();
//
//        for (String part : first) {
//            int number = Integer.parseInt(part);
//            firstList.add(number);
//
//        }
//        for (String part : second) {
//            int number = Integer.parseInt(part);
//            secondList.add(number);
//
//        }
//        List<Integer> newList = new ArrayList<>();
//        int minLength = Math.min(firstList.size(), secondList.size());
//
//        for (int i = 0; i < minLength; i++) {
//
//            newList.add(firstList.get(i));
//            newList.add(secondList.get(i));
//
//        }
//        if (firstList.size() > secondList.size()) {
//            for (int i = minLength - 1; i < firstList.size() - 1; i++) {
//
//                newList.add(firstList.get(i + 1));
//
//
//            }
//        }
//        if (firstList.size() < secondList.size()) {
//            for (int i = minLength - 1; i < secondList.size() - 1; i++) {
//
//
//                newList.add(secondList.get(i + 1));
//
//            }
//        }
//        for (Integer number : newList) {
//            System.out.print(number + " ");
//
//        }

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();


        List<Integer> first = inputToList(firstInput);
        List<Integer> second = inputToList(secondInput);

        int minLength = Math.min(first.size(), second.size());

        for (int i = 0; i < minLength; i++) {
            System.out.print(first.get(i) + " ");
            System.out.print(second.get(i) + " ");
        }
        printAfterIndex(first, minLength);
        printAfterIndex(second, minLength);


    }

    private static void printAfterIndex(List<Integer> list, int startIndex) {
        for (int i = startIndex; i < list.size() ; i++) {
            System.out.print(list.get(i) + " ");

        }
    }


    private static List<Integer> inputToList(String input) {
        String[] parts = input.split(" ");

        List<Integer> result = new ArrayList<>();

        for (String part : parts) {
            int current = Integer.parseInt(part);

            result.add(current);
            
        }
        return result;
    }

}
