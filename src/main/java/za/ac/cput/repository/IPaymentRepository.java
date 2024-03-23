package za.ac.cput.repository;
/**
 * PaymentRepository.java
 * This is the repository program
 * @aurthor Malesela Modiba (222140275)
 * Date: 23 March 2024
 */
import za.ac.cput.domain.Payment;

import java.util.List;
public interface IPaymentRepository extends IRepository<Payment,String>{
    List<Payment>getAll();
}
