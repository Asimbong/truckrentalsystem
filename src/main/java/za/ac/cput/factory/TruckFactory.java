package za.ac.cput.factory;
import za.ac.cput.domain.Truck;
import za.ac.cput.util.Helper;

public class TruckFactory {
    public static Truck buildTruck(String vin, String model, String year, String truckType, String availability, double truckLength, double truckWeight, double truckMaxHeight,
                                   double currentMileage) {
        if (Helper.isNullOrEmpty(vin) ||
                Helper.isNullOrEmpty(model) || Helper.isNullOrEmpty(year) ||
                Helper.isNullOrEmpty(truckType) || !Helper.isValidEmail(String.valueOf(availability)) ||
                Helper.isNullOrEmpty(String.valueOf(truckLength)))
            return null;

        return new Truck.Builder()
                .setVin(vin)
                .setModel(model)
                .setYear(year)
                .setTruckType(truckType)
                .setAvailability(availability)
                .setTruckLength(truckLength)
                .setTruckWeight(truckWeight)
                .setTruckMaxHeight(truckMaxHeight)
                .setCurrentMileage(currentMileage)
                .build();
    }

}

