package za.ac.cput.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.RentTruck;
import za.ac.cput.factory.RentTruckFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * RentTruckServiceTest.java
 * This is the ServiceTest class
 * @author Thandolwethu Zamasiba Khoza (221797289)
 * Date: 18 May 2024
 */

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RentTruckServiceTest {
    @Autowired
    private RentTruckService rentTruckService;
    private static RentTruck rentTruck1;
    private static RentTruck rentTruck2;

    @Order(1)
    @Test
    void setUp() {
        rentTruck1 = RentTruckFactory.buildRentTruck(1432,
                LocalDate.of(2024, 05, 14),
                LocalDate.of(2024, 05, 19),
                8006.0, 321, 7927,
                "10 Dorset St", "Cape Town", "Western Cape", "South Africa");
        assertNotNull(rentTruck1);
        System.out.println(rentTruck1);

        rentTruck2 = RentTruckFactory.buildRentTruck(1452,
                LocalDate.of(2024, 04, 14),
                LocalDate.of(2024, 05, 19),
                17687.0, 322, 7926,
                "10 Dorset St", "Cape Town", "Western Cape", "South Africa");
        assertNotNull(rentTruck2);
        System.out.println(rentTruck2);
    }


    @Order(2)
    @Test
    void create() {
        RentTruck created1 = rentTruckService.create(rentTruck1);
        assertNotNull(created1);
        System.out.println(created1);

        RentTruck created2 = rentTruckService.create(rentTruck2);
        assertNotNull(created2);
        System.out.println(created2);
    }

    @Order(3)
    @Test
    void read() {
        RentTruck read = rentTruckService.read(rentTruck1.getRentId());
        assertNotNull(read);
        System.out.println(read);
    }

    @Order(4)
    @Test
    void update() {
        RentTruck newRent =new RentTruck.Builder().copy(rentTruck2)
                .setTotalCost(16790.89).setCustomerID(320).build();
        RentTruck updatedRent = rentTruckService.update(newRent);
        assertNotNull(updatedRent);
        System.out.println(updatedRent);
    }

    @Order(5)
    @Test
    @Disabled
    void delete() {
    }

    @Order(6)
    @Test
    void getAll() {
        System.out.println(rentTruckService.getAll());
    }
}