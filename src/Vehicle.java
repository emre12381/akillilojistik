public abstract class Vehicle {
    private String vehicleId;
    private double capacityKg;
    private boolean isAvailable;

    public Vehicle(String vehicleId, double capacityKg) {
        this.vehicleId = vehicleId;
        this.capacityKg = capacityKg;
        this.isAvailable = true;
    }

    public String getVehicleId() { return vehicleId; }
    public double getCapacityKg() { return capacityKg; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    public abstract void displayInfo();
}