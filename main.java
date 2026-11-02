import models.Vehicle;
import models.user;
import models.payment;
import models.purchase;
import java.time.LocalDate;
import models.customer;

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
        payment p1 = new payment (1,101,"Muhammd Sehan Asif",4500000,4500000,"Cash",LocalDate.now());
        System.out.println(p1.getPaymentReceipt());
        purchase pu1 = new purchase(101, 0201, 0301, LocalDate.now(), 02500000);
        System.out.println(pu1.getPurchaseDetails());
        customer customer1 = new customer(
            1,
            "Asad Khan",
            "03001234567",
            "asad@gmail.com",
            "Karachi, Pakistan",
            "42201-1234567-1"
        );
        customer1.displaycustomerdetails();
        System.out.println("\nAfter Updating Details:");
        customer1.updatephone("03123456789");
        customer1.displaycustomerdetails();  
    }
}
