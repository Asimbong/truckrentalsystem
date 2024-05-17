package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.RentTruck;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

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
                LocalDate.of(2024, 4, 24),
                LocalDate.of(2024, 5, 28),
                5085.0,
                321,7927, "10 Dorset St",
                "Woodstock", "WesternCape","SA"
        );
        assertNotNull(rentTruck);
        System.out.println(rentTruck);
    }
    @Test
    @Disabled
    void buildRentTruckFail() {
        RentTruck rentTruck = RentTruckFactory.buildRentTruck(
                287,
                LocalDate.of(2024, 4, 24),
                LocalDate.of(2024, 4, 28),
                5085.0,
                321, 7927, "10 Dorset St",
                "Woodstock", "WesternCape","SA"
        );
        assertNull(rentTruck);
        System.out.println(rentTruck);
    }

    @Test
    @Disabled
    void buildRentTruckFail2() {
        RentTruck rentTruck = RentTruckFactory.buildRentTruck(
                287,
                LocalDate.of(2024, 4, 24),
                LocalDate.of(2024, 4, 28),
                5085.0,
                321, 7927, "10 Dorset St",
                "Woodstock", "WesternCape","SA"
        );
        assertNull(rentTruck);
        System.out.println(rentTruck);
    }
    @Test
    @Disabled
    void rentTruckIdentityFail() {
        RentTruck rentTruck = RentTruckFactory.buildRentTruck(
                287,
                LocalDate.of(2024, 4, 24),
                LocalDate.of(2024, 4, 28),
                5085.0,
                321, 7927, "10 Dorset St",
                "Woodstock", "WesternCape","SA"
        );
        RentTruck rentTruck1 = RentTruckFactory.buildRentTruck(
                287,
                LocalDate.of(2024, 4, 24),
                LocalDate.of(2024, 4, 28),
                5085.0,
                321, 7927, "10 Dorset St",
                "Woodstock", "WesternCape","SA"
        );

        assertSame(rentTruck, rentTruck1);
    }

    @Test
    @Disabled
    void rentTruckIdentityPass() {
        RentTruck rentTruck = RentTruckFactory.buildRentTruck(
                287,
                LocalDate.of(2024, 4, 24),
                LocalDate.of(2024, 4, 28),
                5085.0,
                321,7927, "10 Dorset St",
                "Woodstock", "WesternCape","SA"
        );
        RentTruck rentTruck1 = rentTruck;
        assertSame(rentTruck, rentTruck1);
    }

}
