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
    private static final ReturnTruck returnTruck = ReturnTruckFactory.buildReturnTruck("1023", 1010, 50.0, LocalDate.of(2024, 3, 25), LocalTime.of(14, 15));

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
        System.out.println("Update Truck: " + updatedTruck + "\n");
    }

    @Test
    void d_delete() {
        System.out.println("------------------------- Delete Truck ----------------------------------------");

        if (returnTruck != null && returnTruck.getReturnID()  != null) {
            boolean success = returnTruckRepository.delete(returnTruck.getReturnID());
            System.out.println("Deleted Truck: " + success + "\n");
        } else {
            System.out.println("Unable to delete Truck:  truck returnID is null\n");
        }
    }


    @Test
    void e_getAll() {
        System.out.println("------------------------- Display all Trucks ----------------------------------------");
        System.out.println("Display All: ");
        System.out.println(returnTruckRepository.getAll() + "\n");
    }
}


