package za.ac.cput.factory;
import za.ac.cput.domain.Truck;
import za.ac.cput.util.Helper;

/*Author:Ayanda Phumzile Khoza
  Student number:

 Date:18 March 2024*/

public class TruckFactory {

    public static Truck createTruck(String truckId, String model, String year, String availability, String licensePlate, double mileage) {
        if (Helper.isNullOrEmpty(truckId) || Helper.isNullOrEmpty(model) || Helper.isNullOrEmpty(availability)) {
            return null;
        }

        return new Truck.Builder()
                .setTruckId(truckId)
                .setModel(model)
                .setYear(year)
                .setAvailability(availability)
                .setLicensePlate(licensePlate)
                .setMileage(mileage)
                .build();
    }
}
