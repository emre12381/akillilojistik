import java.util.ArrayList;
import java.util.List;

public class LogisticsManager {
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<Package> packages = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
        FileStorageManager.saveLog("Araç Eklendi: " + v.getVehicleId());
    }

    public void addPackage(Package p) {
        packages.add(p);
        FileStorageManager.saveLog("Paket Eklendi: " + p.getPackageId());
    }

    // Açgözlü (Greedy) Optimizasyon Algoritması
    public void optimizeAndDistribute() {
        System.out.println("\n--- Rota ve Dağıtım Optimizasyonu Başlatılıyor ---");
        for (Package p : packages) {
            boolean assigned = false;
            for (Vehicle v : vehicles) {
                if (v.isAvailable() && v.getCapacityKg() >= p.getWeightKg()) {
                    System.out.println("-> " + p.getPackageId() + " nolu paket, " + v.getVehicleId() + " adlı araca yüklendi.");
                    FileStorageManager.saveLog("Dağıtım: " + p.getPackageId() + " -> " + v.getVehicleId());
                    assigned = true;
                    break;
                }
            }
            if (!assigned) {
                System.out.println("-> " + p.getPackageId() + " nolu paket için uygun kapasitede araç bulunamadı!");
            }
        }
    }
}