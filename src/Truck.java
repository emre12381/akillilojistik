public class Truck extends Vehicle {
    public Truck(String vehicleId) {
        super(vehicleId, 5000.0); // Kamyon kapasitesi: 5000 kg
    }

    @Override
    public void displayInfo() {
        System.out.println("[Kamyon] ID: " + getVehicleId() + " | Kapasite: " + getCapacityKg() + " kg");
    }
}