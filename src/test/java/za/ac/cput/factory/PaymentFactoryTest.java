package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Payment;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
/**
 * PaymentFactoryTest.java
 * Payment factory test class
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 19 May 2024
 */
public class PaymentFactoryTest {
   @Test
    void buildPayment(){
        Payment payment = PaymentFactory.buildPayment(3324,12.00, LocalDate.of(2024,02,13),768,"cash");
        assertNotNull(payment);
        System.out.println(payment.toString());
   }
    @Test
    void buildPaymentFailWithID(){
     Payment payment = PaymentFactory.buildPayment(-3324,12.00, LocalDate.of(2024,02,13),768,"cash");
     assertNotNull(payment);
     System.out.println(payment.toString());

    }
 @Test
 void buildPaymentFailWithAmount(){
  Payment payment = PaymentFactory.buildPayment(3324,-12.00, LocalDate.of(2024,02,13),768,"cash");
  assertNotNull(payment);
  System.out.println(payment.toString());

 }
 @Test
 void buildPaymentFailWithDate(){
  Payment payment = PaymentFactory.buildPayment(3324,12.00, LocalDate.of(2024,02,36),768,"cash");
  assertNotNull(payment);
  System.out.println(payment.toString());

 }

}
