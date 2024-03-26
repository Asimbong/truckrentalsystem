package za.ac.cput.repository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Admin;
import za.ac.cput.domain.Payment;
import za.ac.cput.factory.PaymentFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
/**
 * PaymentRepositoryTest.java
 * This is the repository test program
 * @aurthor Malesela Modiba (222140275)
 * Date: 25 March 2024
 */

    @TestMethodOrder(MethodOrderer.MethodName.class)
    class PaymentRepositoryTest {
        private static PaymentRepository paymentRepository = (PaymentRepository) PaymentRepository.getPaymentRepository();
        private static final Payment payment = PaymentFactory.buildPayment(LocalDate.ofEpochDay(2024 - 03 - 25), 7000, 001, "Thomas", "Sipho", "Mercede Astro", 7000);

        private static final Payment.Builder paymentBuilder = new Payment.Builder(); //Create an instance of payment.Builder

        @Test
        void a_create() {
            System.out.println("------------------------- Create Payment ----------------------------------------");
            Payment payment1 = paymentRepository.create(payment);
            assertEquals(payment, payment1);
            System.out.println("Create payment: " + payment1 + "\n");
    }
        @Test
        void b_read() {

            System.out.println("------------------------- Read payment ----------------------------------------");

            Payment readPayment = paymentRepository.read(payment.getInvoiceNum());
            assertNotNull(readPayment);
            System.out.println("Read Admin: " + readPayment + "\n");
        }
        @Test
        void c_update() {
            System.out.println("------------------------- Update payment ----------------------------------------");
            Payment updatedPayment = paymentBuilder.copy(payment).setCustomerName("Daniel Graff").setSalesRep("Mpho Mandela").build();
            //assertNotNull(paymentRepository.update(updatedPayment));
            System.out.println("Update payment: " + updatedPayment + "\n");
        }
        @Test
        void d_delete() {
            System.out.println("------------------------- Delete payment ----------------------------------------");
            if (payment != null && payment.gettruckRented() != null){
                boolean success = paymentRepository.delete(payment.gettruckRented());
                System.out.println("Deleted Payment: " + success + "\n");
                assertTrue(!success);

            } else {
                System.out.println("Unable to delete payment. truckRented is null.\n");
            }
        }
        @Test
        void e_getAll() {
            System.out.println("------------------------- Display all payment ----------------------------------------");
            System.out.println("Display All: ");
            System.out.println(paymentRepository.getAll() + "\n");
        }
        }

