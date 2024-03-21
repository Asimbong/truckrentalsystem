package za.ac.cput.factory;

//Malesela Modiba (222140275)
import za.ac.cput.domain.Payment;
import za.ac.cput.util.Helper;

public class PaymentFactory {
    public static Payment buildPayment(String date, int rentalAmount, int invoiceNum, String customerName, String salesRep, String carRented, int totalAmount) {
        if (Helper.isNullOrEmpty(date) || Helper.isNullOrEmpty(String.valueOf(rentalAmount)) || Helper.isNullOrEmpty(String.valueOf(invoiceNum))
                || Helper.isNullOrEmpty(customerName)
                || Helper.isNullOrEmpty(String.valueOf(totalAmount)) || Helper.isNullOrEmpty(salesRep)
                || Helper.isNullOrEmpty(carRented))
            return null;

        return new Payment.Builder().setDate(date).setRentalAmount(rentalAmount)
                .setCarRented(carRented).setInvoiceNum(invoiceNum).setCustomerName(customerName)
                .setSalesRep(salesRep).setTotalAmount(totalAmount).build();
    }

    public static Payment buildPayment(String date, String customerName, int totalAmount) {
        if (Helper.isNullOrEmpty(date) || Helper.isNullOrEmpty(customerName) || Helper.isNullOrEmpty(String.valueOf(totalAmount)))
            return null;
        int invoiceNum = Integer.parseInt(Helper.generateId());
        return new Payment.Builder().setInvoiceNum(invoiceNum)
                .setDate(date).setCustomerName(customerName).setTotalAmount(totalAmount)
                .build();
    }


}

