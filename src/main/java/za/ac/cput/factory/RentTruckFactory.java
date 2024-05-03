package za.ac.cput.factory;

import za.ac.cput.domain.RentTruck;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

/**
 * RentTruckFactory.java
 * This is the Factory class
 * @author Thandolwethu Zamasiba Khoza (221797289)
 * Date: 03 May 2024
 */

public class RentTruckFactory {
    public static RentTruck buildRentTruck (int rentId, String branchName, String branchLocation,
                                            LocalDate rentDate, LocalDate returnDate,
                                            double totalCost, int customerID) {

        if ((rentId <= 0) ||
                Helper.isNullOrEmpty(branchName) || Helper.isNullOrEmpty(branchLocation) ||
                Helper.isNullOrEmpty(String.valueOf(rentDate)) || !Helper.isNullOrEmpty(String.valueOf(returnDate)) ||
                (totalCost <= 0) || (customerID <= 0))

            return null;

        return new RentTruck.Builder().setRentId(rentId)
                .setBranchName(branchName)
                .setRentDate(rentDate)
                .setReturnDate(returnDate)
                .setCustomerID(customerID)
                .build();
    }
}
