package za.ac.cput.factory;

/**
 * PaymentFactory.java
 * This is the repository program
 * @aurthor Malesela Modiba (222140275)
 * Date: 23 March 2024
 */
import za.ac.cput.domain.Payment;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

public class PaymentFactory {
    public static Payment buildPayment(LocalDate date, int rentalAmount, int invoiceNum, String customerName, String salesRep, String truckRented, int totalAmount) {
        if (Helper.isNullOrEmpty(String.valueOf(date)) || Helper.isNullOrEmpty(String.valueOf(rentalAmount)) || Helper.isNullOrEmpty(String.valueOf(invoiceNum))
                || Helper.isNullOrEmpty(customerName)
                || Helper.isNullOrEmpty(String.valueOf(totalAmount)) || Helper.isNullOrEmpty(salesRep)
                || Helper.isNullOrEmpty(truckRented))
            return null;

        return new Payment.Builder().setDate(date).setRentalAmount(rentalAmount)
                .setTruckRented(truckRented).setInvoiceNum(invoiceNum).setCustomerName(customerName)
                .setSalesRep(salesRep).setTotalAmount(totalAmount).build();
    }

    public static Payment buildPayment(LocalDate date, String customerName, int totalAmount) {
        if (Helper.isNullOrEmpty(String.valueOf(date)) || Helper.isNullOrEmpty(customerName) || Helper.isNullOrEmpty(String.valueOf(totalAmount)))
            return null;
        int invoiceNum = Integer.parseInt(Helper.generateId());
        return new Payment.Builder().setInvoiceNum(invoiceNum)
                .setDate(date).setCustomerName(customerName).setTotalAmount(totalAmount)
                .build();
    }


}

