package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.ReturnCar;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ReturnCarFactoryTest.java
 * This is the factory test class
 * @author Thandolwethu Khoza (221797289)
 * Date: 24 March 2024
 */
public class ReturnCarFactoryTest {

    @Test
    public void testCalculateTotalAmount() {

        ReturnCar returnCar = new ReturnCar("12345", 1001, 50.0, LocalDate.now(), LocalTime.now());

        double expectedTotalAmount = returnCar.getOverdueAmount() * 1.1;

        double actualTotalAmount = returnCar.calculateTotalAmount();

        assertEquals(expectedTotalAmount, actualTotalAmount);

        System.out.println(returnCar);
    }

}
