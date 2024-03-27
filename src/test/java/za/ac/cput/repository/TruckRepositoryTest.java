package za.ac.cput.repository;

import org.junit.jupiter.api.Test;

import za.ac.cput.domain.Truck;

import za.ac.cput.factory.TruckFactory;

import static org.junit.jupiter.api.Assertions.*;

public class TruckRepositoryTest {
    private static TruckRepository truckRepository = (TruckRepository) TruckRepository.getTruckRepository();
    private static Truck truck = TruckFactory.createTruck("Ford" , "2017", "2018", "CP56789", "3333", 23);


    @Test
    void a_create() {

        Truck created = truckRepository.create(truck);

        assertEquals(truck.getTruckId(), created.getTruckId());
        System.out.println("create: " + created);
    }

    @Test
    void b_read() {
        Truck read2 = truckRepository.read(truck.getTruckId());
        assertNull(read2);
        System.out.println("read: " + read2);

    }

    @Test
    void c_update() {


        Truck updated = new Truck.Builder().copy(truck).setTruckId("Polo").setModel("2015").setYear("2018").setAvailability("C3556").setLicensePlate("444").setMileage(24).build();
        assertNull(truckRepository.update(updated));
        System.out.println("updated: " + updated);

    }

    @Test
    void e_delete() {
        boolean success = truckRepository.delete(truck.getTruckId());
        assertFalse(success, "Deletion of truck with ID " + truck.getTruckId() + " failed");
        System.out.println("Deleted truck with ID " + truck.getTruckId() + ": " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("show all: ");
        System.out.println(truckRepository.getAll());

    }


}
