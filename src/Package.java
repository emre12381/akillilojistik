public class Package {
    private String packageId;
    private double weightKg;
    private String destination;

    public Package(String packageId, double weightKg, String destination) {
        this.packageId = packageId;
        this.weightKg = weightKg;
        this.destination = destination;
    }

    public String getPackageId() { return packageId; }
    public double getWeightKg() { return weightKg; }
    public String getDestination() { return destination; }

    @Override
    public String toString() {
        return "Paket ID: " + packageId + " | Ağırlık: " + weightKg + " kg | Hedef: " + destination;
    }
}