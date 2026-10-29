package models;
import java.time.LocalDate;
public class purchase {
    private int purchaseID;
    private int customerID;
    private int vehicleID;
    private LocalDate purchaseDate;
    private double Amount;
    public purchase(int purchaseID, int customerID, int vehicleID,LocalDate purchaseDate, double Amount) {
        setPurchaseID(purchaseID);
        setCustomerID(customerID);
        setVehicleID(vehicleID);
        setpurchaseDate(purchaseDate);
        setAmount(Amount);
    }
    public int getPurchaseID() {
        return purchaseID;
    }
    public int getCustomerID() {
        return customerID;
    }
    public int getVehicleID() {
        return vehicleID;
    }
    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }
    public double getAmount() {
        return Amount;
    }
    public void setPurchaseID(int purchaseID) {
        if (purchaseID > 0) {
            this.purchaseID = purchaseID;
        } else {
            throw new IllegalArgumentException("Purchase ID must be positive");
        }
    }
    public void setCustomerID(int customerID) {
        if (customerID > 0) {
            this.customerID = customerID;
        } else {
            throw new IllegalArgumentException("Customer ID must be positive");
        }
    }
    public void setVehicleID(int vehicleID) {
        if (vehicleID > 0) {
            this.vehicleID = vehicleID;
        } else {
            throw new IllegalArgumentException("Vehicle ID must be positive");
        }
    }
    public void setpurchaseDate(LocalDate purchaseDate) {
        if (purchaseDate != null) {
            this.purchaseDate = purchaseDate;
        } else {
            throw new IllegalArgumentException("Purchase date cannot be null");
        }
    }
    public void setAmount(double Amount) {
        if (Double.isFinite(Amount) && Amount >= 0) {
            this.Amount = Amount;
        } else {
            throw new IllegalArgumentException("Amount must be a non-negative finite number");
        }
    }
    public String getPurchaseDetails() {
        return "\n==== Purchase Details ===="
            + "\nPurchase ID: " + getPurchaseID()
            + "\nCustomer ID: " + getCustomerID()
            + "\nVehicle ID: " + getVehicleID()
            + "\nPurchase Date: " + getPurchaseDate()
            + "\nAmount: Rs. " + getAmount()
            + "\n==========================";
    }
}
