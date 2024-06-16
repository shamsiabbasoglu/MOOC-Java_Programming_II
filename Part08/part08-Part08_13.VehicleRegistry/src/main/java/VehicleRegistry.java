
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleRegistry;

    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (vehicleRegistry.containsKey(licensePlate)) {
            return false;
        }
        vehicleRegistry.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        if (vehicleRegistry.containsKey(licensePlate)) {
            return vehicleRegistry.get(licensePlate);
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (vehicleRegistry.containsKey(licensePlate)) {
            vehicleRegistry.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate licensePlate : vehicleRegistry.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> list = new ArrayList<>();
        for (String string : vehicleRegistry.values()) {
            if (!list.contains(string)) {
                list.add(string);
                System.out.println(string);
            }
        }
    }
}
