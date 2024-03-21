package za.ac.cput.factory;


import za.ac.cput.domain.RentCar;
import za.ac.cput.util.Helper;

import java.time.LocalDate;


/**
 * RentCarFactory.java
 * This is the factory class
 * @aurthor Zukhanye Anele Mene  (219404275)
 * Date: 21 March 2024
 */
public class RentCarFactory {
    public static RentCar buildRentCar(int rentalID, int customerID, int truckID, LocalDate rentalStartDate, LocalDate rentalEndDate, double rentalCost) {
        // Check if any required field is null or empty
        if (Helper.isNullOrEmpty(String.valueOf(rentalID)) ||
            Helper.isNullOrEmpty(String.valueOf(customerID)) ||
            Helper.isNullOrEmpty(String.valueOf(truckID)) ||
                    rentalStartDate == null ||
                    rentalEndDate == null ||
                    Helper.isNullOrEmpty(String.valueOf(rentalCost))) {
            return null;
        }
        // Return a new RentCar object built using the Builder pattern
        return new RentCar.Builder()
                .setRentalID(rentalID)
                .setCustomerID(customerID)
                .setTruckID(truckID)
                .setRentalStartDate(rentalStartDate)
                .setRentalEndDate(rentalEndDate)
                .setRentalCost(rentalCost)
                .build();
    }

//This will properly create RentCar objects with the provided parameters.
}

