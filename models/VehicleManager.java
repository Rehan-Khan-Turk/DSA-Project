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
    public void viewallVehicles(){
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

        vehicle.setPrice(newPrice);
        System.out.println("Price updated successfully!");
        return true;
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



}
