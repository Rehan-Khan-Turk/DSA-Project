import models.Vehicle;
import models.user;
import models.payment;
import models.purchase;
import java.time.LocalDate;
import models.customer;
import models.ReportManager;
import java.util.ArrayList;
import java.util.List;

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

        ReportManager rm = new ReportManager();
        List<purchase> Purchases = new ArrayList<>();
        Purchases.add(new purchase(1, 101, 201,LocalDate.now(), 2500000));
        Purchases.add(new purchase(2, 102, 202,LocalDate.now(), 3000000));
        List<payment> Payments = new ArrayList<>();
        Payments.add(new payment(1, 1, "Ali",2500000, 1500000, "Cash", LocalDate.now()));
        Payments.add(new payment(2, 2, "Ahmed",3000000, 3000000, "Bank Transfer", LocalDate.now()));
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle vehicle1 = new Vehicle(101, "Toyota", "Corolla", 2023, "White", "ABC-123", 2500000);
        Vehicle vehicle2 = new Vehicle(102, "Honda", "Civic", 2022, "Black", "DEF-456", 3000000);
        Vehicle vehicle3 = new Vehicle(103, "Suzuki", "Swift", 2021, "Red", "GHI-789", 2000000);
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        vehicles.add(vehicle3);
        vehicle1.setAvailable(false);
        System.out.println(rm.getpurchaseHistory(Purchases));
        System.out.println(rm.getSalesSummary(Purchases));
        System.out.println(rm.getspaymentSummary(Payments));
        System.out.println(rm.getAvailableVehiclesReport(vehicles));
        System.out.println(rm.getSoldVehiclesReport(vehicles));

    }
}
