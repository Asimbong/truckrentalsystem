package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.RentTruck;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * RentTruckFactoryTest.java
 * This is the FactoryTest class
 * @author Thandolwethu Zamasiba Khoza (221797289)
 * Date: 03 May 2024
 */

public class RentTruckFactoryTest {

    @Test
    void buildRentTruck() {
        RentTruck rentTruck = RentTruckFactory.buildRentTruck(
                287,
                "Wiggle",
                "Cape Town",
                LocalDate.of(2024, 4, 24),
                LocalDate.of(2024, 4, 28),
                5085.0,
                321
        );
        assertNotNull(rentTruck);
        System.out.println(rentTruck);
    }

}
