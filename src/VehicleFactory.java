public class VehicleFactory {
    public static Vehicle createVehicle(String type, String id) {
        if (type.equalsIgnoreCase("truck")) {
            return new Truck(id);
        } else if (type.equalsIgnoreCase("van")) {
            return new Van(id);
        }
        return null;
    }
}