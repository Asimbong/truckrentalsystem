package za.ac.cput.factory;

import za.ac.cput.domain.Payment;
import za.ac.cput.util.Helper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * PaymentFactory.java
 * payment factory class
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 19 May 2024
 */
public class PaymentFactory {
    public static Payment buildPayment(int invoice, double paymentAmount, LocalDate paymentDate,int rentalID, String paymentMethod) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Helper.DateValidatorUsingLocalDate dateValidator = new Helper.DateValidatorUsingLocalDate(dateFormatter);
        if (Helper.isIntNotValid(invoice)||Helper.isIntNotValid(rentalID)||Helper.isDoubleNotNull(paymentAmount)||
                paymentDate == null || !dateValidator.isValid(paymentDate.toString())) {

            return null;
        }
        return new Payment.Builder()
                .setInvoice(invoice)
                .setPaymentAmount(paymentAmount)
                .setPaymentDate(paymentDate)
                .setRentalID(rentalID)
                .setPaymentMethod(paymentMethod)
                .build();
    }
}
