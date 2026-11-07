package models;
import java.util.ArrayList;

public class VehicleManager {
    private ArrayList<Vehicle> vehicles;

    public VehicleManager() {
        vehicles = new ArrayList<>();
    }

    public boolean addVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            return false;
        }
        if (searchVehicleByID(vehicle.getVehicleID()) != null) {
            System.out.println("Vehicle with ID " + vehicle.getVehicleID() + " already exists.");
            return false;
        }
        vehicles.add(vehicle);
        System.out.println("Vehicle with ID " + vehicle.getVehicleID() + " added successfully.");
        return true;

    }
    public void viewAllVehicles(){
        if(vehicles.isEmpty()){
            System.out.println("No vehicles available.");
            return;
        }
            for (Vehicle vehicle : vehicles) {
                System.out.println("-------------------------");
                System.out.println(vehicle);
            }
        
    }
    public Vehicle searchVehicleByID(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleID() == id) {
                return vehicle;
            }
        }
        
        return null;
    }

    public void searchVehicleByMake(String make) {
        if (make == null || make.trim().isEmpty()) {
            System.out.println("Please enter a valid vehicle make.");
            return;
        }

        boolean found = false;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMake().equalsIgnoreCase(make)) {
                System.out.println(vehicle);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Vehicle not found!");
        }
    }

    public boolean updateVehiclePrice(int id, double newPrice) {

        Vehicle vehicle = searchVehicleByID(id);

        if (vehicle == null) {
            System.out.println("Vehicle not found!");
            return false;
        }

        try {
            vehicle.setPrice(newPrice);
            System.out.println("Price updated successfully!");
            return true;
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

     public boolean deleteVehicle(int id) {

        Vehicle vehicle = searchVehicleByID(id);

        if (vehicle == null) {
            System.out.println("Vehicle not found!");
            return false;
        }

        if (!vehicle.isAvailable()) {
            System.out.println("Cannot delete a sold vehicle!");
            return false;
        }

        vehicles.remove(vehicle);
        System.out.println("Vehicle deleted successfully!");
        return true;
    }

     public void viewAvailableVehicles() {

        boolean found = false;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                System.out.println(vehicle);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No available vehicles!");
        }
    }

     public void sortVehiclesByPrice() {

        int n = vehicles.size();

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (vehicles.get(j).getPrice() >
                    vehicles.get(j + 1).getPrice()) {

                    Vehicle temp = vehicles.get(j);

                    vehicles.set(j, vehicles.get(j + 1));

                    vehicles.set(j + 1, temp);
                }
            }
        }

        System.out.println("Vehicles sorted by price!");
    }

}
