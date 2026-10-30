import models.Vehicle;
import models.user;

public class main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(
            101, "Toyota", "Corolla",
            2023, "White", "ABC-123", 4500000
        );

        System.out.println(car);
        System.out.println("Available: " + car.isAvailable());
    
            user user1 = new user(
            005,
            "Rehan Khan Turk",
            "Rehan",
            "rkt123@gmail.com",
            "12345678",
            "03001234567",
            "Admin"
        );
        System.out.println("User Created Successfully!");
        user1.displayUserdetails();
        System.out.println("\nTesting Login:");
        if (user1.login("Rehan Khan Turk", "12345678")) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Failed!");
        }
    }
}
