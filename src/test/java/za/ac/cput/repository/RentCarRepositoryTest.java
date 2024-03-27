package za.ac.cput.repository;


import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Admin;
import za.ac.cput.domain.RentCar;
import za.ac.cput.factory.AdminFactory;
import za.ac.cput.factory.RentCarFactory;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

/**
 * RentCarRepositoryTest.java
 * This is the repository test program
 * @aurthor Zukhanye Anele Mene  (219404275)
 * Date: 26 March 2024
 */
@TestMethodOrder(MethodOrderer.MethodName.class) // help in testing our CRUD method in Alphanumeric order
class RentCarRepositoryTest {

    private static RentCarRepository rentCarRepository;

    private RentCar rentCar ;

    private static final RentCar.Builder rentCarBuilder = new RentCar.Builder(); //Create an instance of Admin.Builder
    @BeforeEach
    void setUp() {

        // Corrected LocalDate values for start and end dates
        LocalDate startDate = LocalDate.of(2024, Month.JANUARY, 2);
        LocalDate endDate = LocalDate.of(2025, Month.JANUARY, 2);

        rentCar = RentCarFactory.buildRentCar(111, 01, 02, startDate,startDate,   800.00);
        rentCarRepository =  (RentCarRepository) RentCarRepository.getRentCarRepository();
        rentCarRepository.rentedCarList.add(rentCar); // Initialize rentCarRepository with rentCar object
    }
    @Test
    void a_create() {
        System.out.println("------------------------- Create RentCar ----------------------------------------");
        RentCar rentCar1 = rentCarRepository.create(rentCar);
        assertEquals(rentCar, rentCar1);
        System.out.println("Create RentCar: " + rentCar1 + "\n");

    }

    @Test
    void b_read() {
        System.out.println("------------------------- Read RentCar ----------------------------------------");

        if (rentCar.getRentalID() != 0) {
            RentCar readCar = rentCarRepository.read(String.valueOf(rentCar.getRentalID()));
            assertNotNull(readCar, "The read car should not be null");
            assertEquals(rentCar, readCar, "The read car should match the car in the repository");
            System.out.println("Read RentedCar: " + readCar + "\n");
        } else {
            System.out.println("RentalID is null, skipping read test.");
        }
    }

    @Test
    void c_update() {
        System.out.println("------------------------- Update RentCar ----------------------------------------");
        RentCar updatedRentCar = rentCarBuilder.copy(rentCar).setCustomerID(02).setTruckID(03).setRentalCost(1000.00).build();
        System.out.println("Update RentedCar: " + updatedRentCar + "\n");
    }

    @Test
    void d_delete() {
        System.out.println("------------------------- Delete RentCar ----------------------------------------");
        if (rentCar != null && rentCar.getRentalID() != 0) {
            boolean success = rentCarRepository.delete(String.valueOf(rentCar.getRentalID()));
            System.out.println("Deleted rentedCar: " + success + "\n");
            assertTrue(success);
        } else {
            System.out.println("Unable to delete rentCar. rentalID is null.\n");
        }
    }



    @Test
    void e_getAll() {
        System.out.println("------------------------- Display all RentCars ----------------------------------------");
        System.out.println("Display All: ");
        System.out.println(rentCarRepository.getAll() + "\n");
    }
}