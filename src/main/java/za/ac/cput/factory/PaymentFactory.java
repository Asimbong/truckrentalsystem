package za.ac.cput.factory;


import za.ac.cput.domain.Payment;
import za.ac.cput.util.Helper;

public class PaymentFactory {
    public static Payment buildDriver(String Date, int RentalAmount, int InvoiceNum, String CustomerName, String SalesRep, String CarRented, int TotalAmount) {
        if (Helper.isNullOrEmpty(Date) || Helper.isNullOrEmpty(String.valueOf(RentalAmount)) || Helper.isNullOrEmpty(String.valueOf(InvoiceNum))
                || Helper.isNullOrEmpty(CustomerName)
                || Helper.isNullOrEmpty(String.valueOf(TotalAmount)) || Helper.isNullOrEmpty(SalesRep)
                || Helper.isNullOrEmpty(CarRented))
            return null;

        return new Payment.Builder().setDate(Date).setRentalAmount(RentalAmount)
                .setCarRented(CarRented).setInvoiceNum(InvoiceNum).setCustomerName(CustomerName)
                .setSalesRep(SalesRep).setTotalAmount(TotalAmount).build();
    }

    public static Payment buildDriver(String Date, String CustomerName, int TotalAmount) {
        if (Helper.isNullOrEmpty(Date) || Helper.isNullOrEmpty(CustomerName) || Helper.isNullOrEmpty(String.valueOf(TotalAmount)))
            return null;
        int InvoiceNum = Integer.parseInt(Helper.generateId());
        return new Payment.Builder().setInvoiceNum(InvoiceNum)
                .setDate(Date).setCustomerName(CustomerName).setTotalAmount(TotalAmount)
                .build();
    }


}

