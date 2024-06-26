import java.util.*;

public class AsocArraysEx8CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> companies = new LinkedHashMap<>();

        while (!"End".equals(input)) {

            String[] tokens = input.split("->");
            String company = tokens[0];
            String employeeID = tokens[1];

            companies.putIfAbsent(company, new ArrayList<>());
            if (!companies.get(company).contains(employeeID)) {
                companies.get(company).add(employeeID);
            }



            input = scanner.nextLine();
        }

        companies
                .entrySet()
                .stream()
                .sorted((c1, c2) -> c1.getKey().compareTo(c2.getKey()))
                .forEach(entry -> {
                    System.out.println(String.format("%s", entry.getKey()));
                    entry
                            .getValue()
                            .stream()
                            .sorted((e1, e2) -> e1.compareTo(e2))
                            .forEach(e -> System.out.println(String.format("-- %s", e)));
                });
    }
}
