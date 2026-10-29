public class Van extends Vehicle {
    public Van(String vehicleId) {
        super(vehicleId, 1500.0); // Panelvan kapasitesi: 1500 kg
    }

    @Override
    public void displayInfo() {
        System.out.println("[Panelvan] ID: " + getVehicleId() + " | Kapasite: " + getCapacityKg() + " kg");
    }
}