package za.ac.cput.factory;
import za.ac.cput.domain.RentTruck;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

public class RentTruckFactory {
    public static RentTruck buildRentTruck(int rentId, String branchName, String branchLocation,
                                           LocalDate rentDate , LocalDate returnDate, int customerID) {
               if (Helper.isNullOrEmpty(String.valueOf(rentId)) ||
                Helper.isNullOrEmpty(branchName) || Helper.isNullOrEmpty(branchLocation) ||
                Helper.isNullOrEmpty(String.valueOf(rentDate)) || !Helper.isValidEmail(String.valueOf(returnDate)) ||
                Helper.isNullOrEmpty(String.valueOf(customerID)))
            return null;

        return new RentTruck.Builder().setRentId(rentId)
                .setBranchName(branchName)
                .setBranchLocation(branchLocation)
                .setRentDate(rentDate)
                .setReturnDate(returnDate)
                .build();
    }
}
