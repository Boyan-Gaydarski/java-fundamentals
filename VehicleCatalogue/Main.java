package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();

        int carsHorsepower = 0;
        int trucksHorsepower = 0;

        String command = scanner.nextLine();


        while (!"End".equals(command)) {


            String[] tokens = command.split("\\s+");

            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horsepower = Integer.parseInt(tokens[3]);

            if ("car".equals(type)) {
                Car car = new Car(model, color, horsepower);
                carsHorsepower += car.getHorsepower();
                cars.add(car);
            } else if ("truck".equals(type)) {
                Truck truck = new Truck(model, color, horsepower);
                trucksHorsepower += truck.getHorsepower();
                trucks.add(truck);
            }


            command = scanner.nextLine();
        }

        command = scanner.nextLine();
        while (!"Close the catalogue".equals(command)) {

            for (Truck truck : trucks) {
                if (truck.getModel().equals(command)) {
                    System.out.println(truck);
                    break;
                }
                
            }
            for (Car car : cars) {
                if (car.getModel().equals(command)) {
                    System.out.println(car);
                    break;
                }

            }

            command = scanner.nextLine();
        }
        double avgCarHorsepower = carsHorsepower * 1.0 / cars.size();
        System.out.printf("Cars have average horsepower of: %.2f.%n", avgCarHorsepower);
        double avgTruckHorsepower = trucksHorsepower * 1.0 / trucks.size();
        System.out.printf("Trucks have average horsepower of: %.2f.%n", avgTruckHorsepower);



    }
}
