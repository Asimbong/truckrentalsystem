package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Payment;
import za.ac.cput.repository.PaymentRepository;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * PaymentService.java
 * PaymentService class
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 19 May 2024
 */
@Service
public class PaymentService implements IPaymentService{
    private PaymentRepository paymentRepository;
    @Autowired
    PaymentService(PaymentRepository paymentRepository){this.paymentRepository = paymentRepository;}

    @Override
    public Payment create(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment read(Integer invoice) {
        return this.paymentRepository.findById(invoice).orElse(null);
    }

    @Override
    public Payment update(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public void delete(Integer invoice) {
        paymentRepository.deleteById(invoice);
    }

    @Override
    public Set<Payment> getAll() {
        return paymentRepository.findAll().stream().collect(Collectors.toSet());
    }
}
