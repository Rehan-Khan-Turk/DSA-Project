import models.Vehicle;

public class main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(
            101, "Toyota", "Corolla",
            2023, "White", "ABC-123", 4500000
        );

        System.out.println(car);
        System.out.println("Available: " + car.isAvailable());
    }
}
