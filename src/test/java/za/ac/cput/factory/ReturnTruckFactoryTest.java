package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.ReturnTruck;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ReturnTruckFactoryTest.java
 * This is the factory test class
 * @author Thandolwethu Khoza (221797289)
 * Date: 24 March 2024
 */
public class ReturnTruckFactoryTest {

    @Test
    public void testCalculateTotalAmount() {

        ReturnTruck returnTruck = new ReturnTruck(12345, 1001, 50.0, LocalDate.now(), LocalTime.now());

        double expectedTotalAmount = returnTruck.getOverdueAmount() * 1.1;

        double actualTotalAmount = returnTruck.calculateTotalAmount();

        assertEquals(expectedTotalAmount, actualTotalAmount);

        System.out.println(returnTruck);
    }

}
