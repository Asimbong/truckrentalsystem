package za.ac.cput.repository;

import za.ac.cput.domain.Payment;

import java.util.ArrayList;
import java.util.List;
/**
 * PaymentRepository.java
 * This is the repository program
 * @aurthor Malesela Modiba (222140275)
 * Date: 23 March 2024
 */
public class PaymentRepository implements IPaymentRepository{
    private static IPaymentRepository paymentRepository = null;

    private List<Payment> paymentList;

    private PaymentRepository() {
        paymentList = new ArrayList<Payment>();
    }

    public static IPaymentRepository getPaymentRepository() {
        if (paymentRepository == null) {
            paymentRepository = new PaymentRepository();
        }
        return paymentRepository;
    }

    @Override
    public List<Payment> getAll() {
        return paymentList;
    }

    @Override
    public Payment create(Payment payment) {
        boolean success = paymentList.add(payment);
        if (success)
            return payment;
        return null;
    }

    @Override
    public Payment read(String s) {
        return null;
    }

    public Payment read(int id) {
        for (Payment payment : paymentList) {
            if (payment.getInvoiceNum() == id)
                return payment;
        }
        return null;
    }
    @Override
    public Payment update(Payment payment) {
        String paymentID = String.valueOf(payment.getInvoiceNum());
        if(delete(paymentID)) {
            if (paymentList.add(payment))
                return payment;
            else
                return null;
    }
    return null;
    }
    @Override
    public boolean delete(String id) {
        Payment paymentToDelete = read(id);
        if (paymentToDelete == null)
            return false;
        return (paymentList.remove(paymentToDelete));
    }

}

