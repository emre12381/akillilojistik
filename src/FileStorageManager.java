import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileStorageManager {
    public static void saveLog(String data) {
        try (PrintWriter out = new PrintWriter(new FileWriter("logistics_data.txt", true))) {
            out.println(data);
        }
        catch (IOException e) {
            System.out.println("Dosya yazma hatası: " + e.getMessage());
        }
    }
}