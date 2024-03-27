package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.RentTruck;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertNotNull;
/**
 * RentCarFactoryTest.java
 * This is the factory test class
 * @aurthor Zukhanye Anele Mene (219404275)
 * Date: 26 March 2024
 */
class RentTruckFactoryTest {

    LocalDate startDate = LocalDate.of(2024, Month.JANUARY, 2);
    LocalDate endDate = LocalDate.of(2025, Month.JANUARY, 2);
    @Test
    public void createRentTruck() {



        RentTruck rentTruck = RentTruckFactory.buildRentTruck(1, 1 , 1, startDate, endDate, 0.00 );
        assertNotNull(rentTruck);
        System.out.println(rentTruck);
    }
}
