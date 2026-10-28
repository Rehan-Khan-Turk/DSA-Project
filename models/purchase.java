package models;
import java.util.Scanner;
import java.time.LocalDate;
public class purchase {
    private int purchaseID;
    private int customerID;
    private int vehicleID;
    private LocalDate purchaseDate;
    private double Amount;
    public purchase(){
        this.purchaseDate= LocalDate.now();
    }
    public int getPurchaseID(){
        return purchaseID;
    }
    public void setPurchaseID(int purchaseID){
        if (purchaseID > 0){
            this.purchaseID=purchaseID;
        } else {
            throw new IllegalArgumentException("Purchase ID must be positive");
        }
        }
    public int getCustomerID(){
        return customerID;
    }
    public void setCustomerID(int customerID){
        if (customerID > 0){
            this.customerID=customerID;
        } else {
            throw new IllegalArgumentException("Customer ID must be positive");
        }
    }
    public int getVehicleID(){
        return vehicleID;
    }
    public void setVehicleID(int vehicleID){
        if (vehicleID > 0){
            this.vehicleID=vehicleID;
        } else {
            throw new IllegalArgumentException("Vehicle ID must be positive");
        }
    }
    public LocalDate getPurchaseDate(){
        return purchaseDate;
    }
    public void setpurchaseDate(LocalDate purchaseDate){
        if (purchaseDate != null){
            this.purchaseDate=purchaseDate;
        } else {
            throw new IllegalArgumentException("Purchase date cannot be null");
        }
    }
    public double getAmount(){
        return Amount;
    }
    public void setAmount(double Amount){
        if (Double.isFinite(Amount) && Amount >= 0){
            this.Amount=Amount;
        } else {
            throw new IllegalArgumentException("Amount must be a non-negative finite number");
        }
    }
    public void inputPurchase(Scanner sc) {
        System.out.println("\n==== Enter Purchase Details ====");
        while (true){
            System.out.print("Enter Purchase ID: ");
            if (sc.hasNextInt()){
                int id = sc.nextInt();
                if (id > 0){
                    setPurchaseID(id);
                    break;
                }
            }else {
                    sc.next();
                }
                System.out.println("Purchase ID must be positive. Please try again.");
            }
            while (true){
                System.out.print("Enter Customer ID: ");
                if(sc.hasNextInt()){
                    int id = sc.nextInt();
                    if (id > 0){
                        setCustomerID(id);
                        break;
                    }
                } else {
                    sc.next();
                }
                System.out.println("Customer ID must be positive. Please try again.");
        }
        while (true){
            System.out.println("Enter Vehicle ID: ");
            if (sc.hasNextInt()){
                int id = sc.nextInt();
                if (id > 0){
                    setVehicleID(id);
                    break;
                }
            } else {
                sc.next();
            }
            System.out.println("Vehicle ID must be positive. Please try again.");
        }
        while (true){
            System.out.println("enter Purchase Amount: ");
            if (sc.hasNextDouble()){
                double amount = sc.nextDouble();
                if (Double.isFinite(amount) && amount >= 0){
                    setAmount(amount);
                    break;
                }
            } else {
                sc.next();
            }
            System.out.println("Amount must be a non-negative finite number. Please try again.");
        }
        setpurchaseDate(LocalDate.now());
        System.out.println("\nPurchase details recorded successfully.");
    }

    public void displayPurchase(){
        System.out.println("\n==== Purchase Details ====");
        System.out.println("PurchaeID:" + getPurchaseID());
        System.out.println("CustomerID:" + getCustomerID());
        System.out.println("VehicleID:" + getVehicleID());
        System.out.println("Purchase Date:" + getPurchaseDate());
        System.out.println("Amount: RS." + getAmount());
    }
}