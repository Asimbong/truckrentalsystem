package za.ac.cput.factory;

import za.ac.cput.domain.RentTruck;
import za.ac.cput.util.Helper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * RentTruckFactory.java
 * This is the Factory class
 * @author Thandolwethu Zamasiba Khoza (221797289)
 * Date: 03 May 2024
 */

public class RentTruckFactory {
    public static RentTruck buildRentTruck(int rentId, String branchName, String branchLocation,
                                           LocalDate rentDate, LocalDate returnDate, double totalCost,
                                           int customerID) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Helper.DateValidatorUsingLocalDate dateValidator = new Helper.DateValidatorUsingLocalDate(dateFormatter);
        if (Helper.isIntNotValid(rentId) ||
                Helper.isNullOrEmpty(branchName) ||
                Helper.isNullOrEmpty(branchLocation) ||
                rentDate == null || !dateValidator.isValid(rentDate.toString()) ||
                returnDate == null || !dateValidator.isValid(returnDate.toString()) ||
                Helper.isDoubleNotNull(totalCost) || Helper.isIntNotValid(customerID)) {

            return null;
        }
        return new RentTruck.Builder().setRentId(rentId)
                .setBranchName(branchName)
                .setBranchLocation(branchLocation)
                .setRentDate(rentDate)
                .setReturnDate(returnDate)
                .setTotalCost(totalCost)
                .setCustomerID(customerID)
                .build();
    }
}
