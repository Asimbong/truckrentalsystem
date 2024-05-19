package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Payment;

/**
 * PaymentRepository.java
 * Payment repository interface
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 19 May 2024
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
