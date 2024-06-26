import java.util.Scanner;

public class FundTextProcessingEx3ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();

        int slashIndex = path.lastIndexOf('\\');
        int pointIndex = path.lastIndexOf('.');

        String fileName = path.substring(slashIndex + 1, pointIndex);
        String fileExtension = path.substring(pointIndex + 1);


//                  MY SOLUTION
//        String[] input = scanner.nextLine().split("\\\\");
//
//
//        String targetFile = input[input.length - 1];
//
//        String[] tokens = targetFile.split("\\.");
//
//        String fileName = tokens[0];
//        String fileExtension = tokens[1];
//
        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s%n", fileExtension);
    }
}
