import java.util.Scanner;

public class FundMethodsEx11ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input[i]);

        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] token = command.split(" ");

            switch (token[0]) {
                case "exchange": {
                    int index = Integer.parseInt(token[1]);
                    if (index < 0 || index >= array.length) {
                        System.out.println("Invalid index");
                    } else {

                        exchange(array, index);
                    }
                }
                break;
                case "max": {
                    switch (token[1]) {
                        case "even":
                            maxEven(array);
                            break;
                        default:
                            maxOdd(array);
                            break;
                    }
                    break;
                }
                case "min": {
                    switch (token[1]) {
                        case "even":
                            minEven(array);
                            break;
                        default:
                            minOdd(array);
                            break;
                    }
                    break;
                }
                case "first": {
                    int count = Integer.parseInt(token[1]);
                    switch (token[2]) {
                        case "even":
                            firstCountEven(array, count);
                            break;
                        default:
                            firstCountOdd(array, count);
                            break;
                    }
                    break;
                }
                case "last": {
                    int count = Integer.parseInt(token[1]);
                    switch (token[2]) {
                        case "even":
                            lastCountEven(array, count);
                            break;
                        default:
                            lastCountOdd(array, count);
                            break;

                    }
                    break;
                }
            }


            command = scanner.nextLine();
        }

        printArray(array);
    }

    private static void exchange(int[] array, int index) {
        int[] temp = copyArray(array);
        int count = 0;

        for (int i = index + 1; i < temp.length; i++) {

            array[count] = temp[i];
            count++;

        }
        for (int i = 0; i <= index; i++) {
            array[count] = temp[i];
            count++;

        }
    }

    private static int[] copyArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];

        }
        return newArray;
    }

    private static void maxEven(int[] array) {

        int maxEven = Integer.MIN_VALUE;
        boolean flag = false;
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {

                if (array[i] >= maxEven) {
                    maxEven = array[i];
                    flag = true;
                    index = i;

                }
            }

        }
        if (flag) {
            System.out.println(index);
        } else {
            System.out.println("No matches");
        }
    }

    private static void maxOdd(int[] array) {
        int maxOdd = Integer.MIN_VALUE;
        boolean flag = false;
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {

                if (array[i] >= maxOdd) {
                    maxOdd = array[i];
                    flag = true;
                    index = i;

                }
            }

        }
        if (flag) {
            System.out.println(index);
        } else {
            System.out.println("No matches");
        }
    }

    private static void minEven(int[] array) {
        int minEven = Integer.MAX_VALUE;
        boolean flag = false;
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {

                if (array[i] <= minEven) {
                    minEven = array[i];
                    flag = true;
                    index = i;

                }
            }

        }
        if (flag) {
            System.out.println(index);
        } else {
            System.out.println("No matches");
        }

    }

    private static void minOdd(int[] array) {
        int minOdd = Integer.MAX_VALUE;
        boolean flag = false;
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {

                if (array[i] <= minOdd) {
                    minOdd = array[i];
                    flag = true;
                    index = i;

                }
            }

        }
        if (flag) {
            System.out.println(index);
        } else {
            System.out.println("No matches");
        }
    }

    private static void firstCountEven(int[] array, int count) {
        int[] result = new int[0];
        if (count > array.length) {
            System.out.println("Invalid count");
            return;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    result = expandAndAddToArray(result, array[i]);
                    if (result.length == count) {
                        break;
                    }
                }

            }
        }

        printArray(result);
    }

    private static void firstCountOdd(int[] array, int count) {
        int[] result = new int[0];
        if (count > array.length) {
            System.out.println("Invalid count");
            return;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    result = expandAndAddToArray(result, array[i]);
                    if (result.length == count) {
                        break;
                    }
                }

            }
        }

        printArray(result);
    }


    private static void lastCountEven(int[] array, int count) {
        int[] result = new int[0];
        if (count > array.length) {
            System.out.println("Invalid count");
            return;
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] % 2 == 0) {
                    result = expandAndAddToArray(result, array[i]);
                    if (result.length == count) {
                        break;
                    }
                }

            }
        }
        reverseArray(result);
        printArray(result);

    }

    private static void lastCountOdd(int[] array, int count) {
        int[] result = new int[0];
        if (count > array.length) {
            System.out.println("Invalid count");
            return;
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] % 2 != 0) {
                    result = expandAndAddToArray(result, array[i]);
                    if (result.length == count) {
                        break;
                    }
                }

            }
        }
        reverseArray(result);
        printArray(result);

    }

    private static void reverseArray(int[] array) {
        int[] temp = copyArray(array);
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = temp[array.length - 1 - i];

        }
    }

    private static int[] expandAndAddToArray(int[] oldArray, int newElement) {
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];

        }
        newArray[newArray.length - 1] = newElement;
        return newArray;
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(", " + array[i]);
            }
        }
        System.out.println("]");
    }
}
