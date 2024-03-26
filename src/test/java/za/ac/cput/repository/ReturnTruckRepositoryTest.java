package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.ReturnTruck;
import za.ac.cput.factory.ReturnTruckFactory;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ReturnTruckRepositoryTest.java
 * This is the repository test class
 * @author Thandolwethu Khoza (221797289)
 * Date: 24 March 2024
 */

@TestMethodOrder(MethodOrderer.MethodName.class)
class ReturnTruckRepositoryTest {
    private static ReturnTruckRepository returnTruckRepository = (ReturnTruckRepository) ReturnTruckRepository.getReturnTruckRepository();
    private static final ReturnTruck returnTruck = ReturnTruckFactory.buildReturnTruck(1023, 1010, 50.0, LocalDate.of(2024, 3, 25), LocalTime.of(14, 15));

    private static final ReturnTruck.Builder returnTruckBuilder = new ReturnTruck.Builder();

    @Test
    void a_create() {
        System.out.println("------------------------- Create Truck ----------------------------------------");
        ReturnTruck returnTruck1 = returnTruckRepository.create(returnTruck);
        assertNotNull(returnTruck1, "Failed to create truck");
        assertEquals(returnTruck, returnTruck1, "Created truck is not equal to expected truck");
        System.out.println("Create Truck: " + returnTruck1 + "\n");
    }

    @Test
    void b_read() {
        System.out.println("------------------------- Read Truck ----------------------------------------");
        ReturnTruck readreturnTruck = returnTruckRepository.read(returnTruck.getReturnID());
        assertNotNull(readreturnTruck, "Failed to read truck");
        assertEquals(returnTruck, readreturnTruck, "Read truck does not match expected truck");
        System.out.println("Read Truck: " + readreturnTruck + "\n");
    }

    @Test
    void c_update() {
        System.out.println("------------------------- Update Truck ----------------------------------------");
        ReturnTruck updatedTruck = returnTruckBuilder.copy(returnTruck).setOverdueAmount(60.5).setTimeReturn(LocalTime.of(14, 15)).build();
        ReturnTruck updatedReturnTruck = returnTruckRepository.update(updatedTruck);
        assertNotNull(updatedReturnTruck, "Failed to update truck");
        assertEquals(updatedTruck, updatedReturnTruck, "Updated truck does not match expected truck");
        System.out.println("Update Truck: " + updatedTruck + "\n");
    }

    @Test
    void d_delete() {
        System.out.println("------------------------- Delete Truck ----------------------------------------");
        boolean success = returnTruckRepository.delete(String.valueOf(returnTruck.getReturnID()));
        assertTrue(success, "Failed to delete truck");
        System.out.println("Deleted Truck: " + success + "\n");
    }

    @Test
    void e_getAll() {
        System.out.println("------------------------- Display all Trucks ----------------------------------------");
        System.out.println("Display All: ");
        System.out.println(returnTruckRepository.getAll() + "\n");
    }
}

//    private ReturnTruckRepository;
//
//    @BeforeEach
//    void setUp() {
//        returnTruckRepository = (ReturnTruckRepository) ReturnTruckRepository.getReturnTruckRepository();
//        returnTruckRepository.create(new ReturnTruck.Builder()
//                .setReturnID(1)
//                .setRentalID(1001)
//                .setOverdueAmount(50.0)
//                .setDateReturn(LocalDate.of(2024, 3, 24))
//                .setTimeReturn(LocalTime.of(12, 30))
//                .build());
//        returnTruckRepository.create(new ReturnTruck.Builder()
//                .setReturnID(2)
//                .setRentalID(1002)
//                .setOverdueAmount(75.0)
//                .setDateReturn(LocalDate.of(2024, 3, 25))
//                .setTimeReturn(LocalTime.of(14, 15))
//                .build());
//
//    }
//    @Test
//    void getAll() {
//        System.out.println(returnTruckRepository.getAll() + "\n");
//        System.out.println(returnTruckRepository);
//    }
//
//    @Test
//    void create() {
//        ReturnTruck newReturnTruck = new ReturnTruck.Builder()
//                .setReturnID(3)
//                .setRentalID(1003)
//                .setOverdueAmount(60.0)
//                .setDateReturn(LocalDate.of(2024, 3, 26))
//                .setTimeReturn(LocalTime.of(10, 45))
//                .build();
//        ReturnTruck createdReturnTruck = returnTruckRepository.create(newReturnTruck);
//        assertEquals(newReturnTruck, createdReturnTruck);
//
//        System.out.println(newReturnTruck);
//
//}

//    @Test
//    void update() {
//
//    }

//    @Test
//    void delete() {
//
//    }


