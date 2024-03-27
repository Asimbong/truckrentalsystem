package za.ac.cput.repository;


import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Admin;
import za.ac.cput.domain.RentTruck;
import za.ac.cput.factory.AdminFactory;
import za.ac.cput.factory.RentTruckFactory;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

/**
 * RentTruckRepositoryTest.java
 * This is the repository test program
 * @aurthor Zukhanye Anele Mene  (219404275)
 * Date: 26 March 2024
 */
@TestMethodOrder(MethodOrderer.MethodName.class) // help in testing our CRUD method in Alphanumeric order
class RentTruckRepositoryTest {

    private static RentTruckRepository rentTruckRepository;

    private RentTruck rentTruck ;

    private static final RentTruck.Builder rentTruckBuilder = new RentTruck.Builder(); //Create an instance of Admin.Builder
    @BeforeEach
    void setUp() {

        // Corrected LocalDate values for start and end dates
        LocalDate startDate = LocalDate.of(2024, Month.JANUARY, 2);
        LocalDate endDate = LocalDate.of(2025, Month.JANUARY, 2);

        rentTruck = RentTruckFactory.buildRentTruck(111, 01, 02, startDate,startDate,   800.00);
        rentTruckRepository =  (RentTruckRepository) RentTruckRepository.getRentTruckRepository();
        rentTruckRepository.rentedTruckList.add(rentTruck); // Initialize rentTruckRepository with rentTruck object
    }
    @Test
    void a_create() {
        System.out.println("------------------------- Create RentTruck ----------------------------------------");
        RentTruck rentTruck1 = rentTruckRepository.create(rentTruck);
        assertEquals(rentTruck, rentTruck1);
        System.out.println("Create RentTruck: " + rentTruck1 + "\n");

    }

    @Test
    void b_read() {
        System.out.println("------------------------- Read RentTruck ----------------------------------------");

        if (rentTruck.getRentalID() != 0) {
            RentTruck readTruck = rentTruckRepository.read(String.valueOf(rentTruck.getRentalID()));
            assertNotNull(readTruck, "The read Truck should not be null");
            assertEquals(rentTruck, readTruck, "The read Truck should match the Truck in the repository");
            System.out.println("Read RentedTruck: " + readTruck + "\n");
        } else {
            System.out.println("RentalID is null, skipping read test.");
        }
    }

    @Test
    void c_update() {
        System.out.println("------------------------- Update RentTruck ----------------------------------------");
        RentTruck updatedRentTruck = rentTruckBuilder.copy(rentTruck).setCustomerID(02).setTruckID(03).setRentalCost(1000.00).build();
        System.out.println("Update RentedTrcuk: " + updatedRentTruck + "\n");
    }

    @Test
    void d_delete() {
        System.out.println("------------------------- Delete RentTruck ----------------------------------------");
        if (rentTruck != null && rentTruck.getRentalID() != 0) {
            boolean success = rentTruckRepository.delete(String.valueOf(rentTruck.getRentalID()));
            System.out.println("Deleted rentedTruck: " + success + "\n");
            assertTrue(success);
        } else {
            System.out.println("Unable to delete rentTruck. rentalID is null.\n");
        }
    }



    @Test
    void e_getAll() {
        System.out.println("------------------------- Display all RentTrucks ----------------------------------------");
        System.out.println("Display All: ");
        System.out.println(rentTruckRepository.getAll() + "\n");
    }
}