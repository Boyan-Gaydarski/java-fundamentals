package VehicleCatalogue;

public class Car {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Car(String model, String color, int horsepower) {
        this.type = "Car";
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }



    public int getHorsepower() {
        return this.horsepower;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                this.type, this.model, this.color, this.horsepower);
    }
}
