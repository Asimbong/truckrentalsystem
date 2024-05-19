package za.ac.cput.service;

import za.ac.cput.domain.Payment;

import java.util.Set;

/**
 * IPaymentService.java
 * Payment service interface
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 19 May 2024
 */
public interface IPaymentService extends IService<Payment,Integer> {
    Payment update(Payment payment);
    Set<Payment> getAll();
}
