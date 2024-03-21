package za.ac.cput.factory;

import za.ac.cput.domain.ReturnCar;
import za.ac.cput.util.Helper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * ReturnCarFactory.java
 * This is the Factory program
 * @author Thandolwethu Khoza (221797289)
 * Date: 21 March 2024
 */

public class ReturnCarFactory {
    public static ReturnCar buildReturnCar(String returnID, int rentalID, double overdueAmount, LocalDate dateReturn, LocalDateTime timeReturn) {
        if (Helper.isNullOrEmpty(returnID) || Helper.isNullOrEmpty(String.valueOf(rentalID)) || Helper.isNullOrEmpty(String.valueOf(overdueAmount))
                || Helper.isNullOrEmpty(String.valueOf(dateReturn)) ||  Helper.isNullOrEmpty(String.valueOf(timeReturn)))
                return null;

        return new ReturnCar.Builder().setReturnID(returnID).setRentalID(rentalID)
                .setOverdueAmount(overdueAmount).setDateReturn(dateReturn).setTimeReturn(LocalTime.from(timeReturn)).build();
    }
    public static ReturnCar buildReturnCar(int rentalID, double overdueAmount, LocalDate dateReturn) {
        if (Helper.isNullOrEmpty(String.valueOf(rentalID)) || Helper.isNullOrEmpty(String.valueOf(overdueAmount))
                || Helper.isNullOrEmpty(String.valueOf(dateReturn)))
            return null;

        String returnID = Helper.generateId();

        return new ReturnCar.Builder().setReturnID(returnID).setRentalID(rentalID)
                .setOverdueAmount(overdueAmount).setDateReturn(dateReturn).build();
    }
}
