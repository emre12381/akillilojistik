import java.util.Scanner;

public class LogisticsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LogisticsManager manager = new LogisticsManager();

        // Örnek başlangıç verileri
        manager.addVehicle(VehicleFactory.createVehicle("truck", "TR-01"));
        manager.addVehicle(VehicleFactory.createVehicle("van", "VN-01"));

        while (true) {
            System.out.println("\n=== AKILLI LOJİSTİK SİSTEMİ ===");
            System.out.println("1. Araç Ekle");
            System.out.println("2. Paket Ekle");
            System.out.println("3. Dağıtımı ve Rotaları Optimize Et");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // buffer temizleme

            switch (choice) {
                case 1:
                    System.out.print("Araç Türü (truck/van): ");
                    String tType = scanner.nextLine();
                    System.out.print("Araç ID: ");
                    String tId = scanner.nextLine();
                    Vehicle v = VehicleFactory.createVehicle(tType, tId);
                    if (v != null) {
                        manager.addVehicle(v);
                        System.out.println("Araç başarıyla eklendi.");
                    } else {
                        System.out.println("Geçersiz araç türü!");
                    }
                    break;
                case 2:
                    System.out.print("Paket ID: ");
                    String pId = scanner.nextLine();
                    System.out.print("Ağırlık (kg): ");
                    double weight = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Teslimat Adresi: ");
                    String dest = scanner.nextLine();
                    manager.addPackage(new Package(pId, weight, dest));
                    System.out.println("Paket eklendi.");
                    break;
                case 3:
                    manager.optimizeAndDistribute();
                    break;
                case 4:
                    System.out.println("Sistemden çıkılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}