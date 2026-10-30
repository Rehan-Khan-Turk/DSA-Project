package models;

public class Vehicle {
    private final int vehicleID;
    private String make;
    private String model;
    private int year;
    private String color;
    private String licensePlate;
    private boolean available;
    private double price;

    public Vehicle(int vehicleID, String make, String model, int year, String color, String licensePlate, double price) {
        if (vehicleID <= 0) {
            throw new IllegalArgumentException("Vehicle ID must be positive");
        }

       this.vehicleID = vehicleID;
        setMake(make);
        setModel(model);
        setYear(year);
        setColor(color);
        setLicensePlate(licensePlate);
        this.available = true;
        setPrice(price);   
    }

    public int getVehicleID() {
        return vehicleID;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public boolean isAvailable() {
        return available;
    }
    public double getPrice() {
        return price;
    }
    public void setMake(String make) {
        if (make == null || make.trim().isEmpty()) {
            throw new IllegalArgumentException("Make cannot be empty");
        }
        this.make = make.trim();
    }
    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be empty");
        }
        this.model = model.trim();
    }
    public void setYear(int year) {
        if (year < 1886 || year > java.time.Year.now().getValue() + 1) {
            throw new IllegalArgumentException("Year must be between 1886 and 2024");
        }
        this.year = year;
    }
    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("Color cannot be empty");
        }
        this.color = color.trim();
    }
    public void setLicensePlate(String licensePlate) {
        if (licensePlate == null || licensePlate.trim().isEmpty()) {
            throw new IllegalArgumentException("License plate cannot be empty");
        }
        this.licensePlate = licensePlate.trim();
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }
    @Override 
    public String toString() {
        return "Vehicle ID: " + vehicleID + ", Make: " + make + ", Model: " + model + ", Year: " + year +
                ", Color: " + color + ", License Plate: " + licensePlate + ", Available: " + available +
                ", Price: RS" + price;
    }
}
