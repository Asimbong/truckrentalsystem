package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Payment;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
/**
 * PaymentFactoryTest.java
 * This is the factory test class
 * @aurthor Malesela Modiba (222140275)
 * Date: 25 March 2024
 */
public class PaymentFactoryTest {
    @Test
    public void createPayment() {

        Payment payment = PaymentFactory.buildPayment(LocalDate.ofEpochDay(2024-03-25), 11000, 001, "Samual",
                "Thandiwe Molo", "Mercedes Actros",11000 );
        assertNotNull(payment);
        System.out.println(payment);

    }
}
