import java.util.Scanner;

public class SecondLastBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        System.out.println((n >> 1) & 1);
    }
}
