package za.ac.cput.service;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Insurance;
import za.ac.cput.domain.Truck;
import za.ac.cput.factory.TruckFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class
TruckServiceTest {

    @Autowired
    private TruckService truckService;
    private Truck truck = TruckFactory.buildTruck("Serial", "Scania", "2022"
            , "Diecast","Locaion",16.50, 2.55,1.1,30);

    @Test
    void a_create() {
        Truck createdTruck = truckService.create(truck);
        assertEquals(truck.getTruckLength(), createdTruck.getTruckLength());
        System.out.println("Created Truck: " + createdTruck);
    }

    @Test
    void b_read() {
        Truck read = truckService.read(truck.getTruckLength());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Truck newTruck = new Truck.Builder().copy(truck).setModel("Scania").build();
        Truck updated = truckService.update(newTruck);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Disabled
    void e_delete() {
        truckService.delete(truck.getTruckLength());
        System.out.println("Successfully deleted insurance");
    }

    @Test
    void d_getAll() {
        System.out.println(truckService.getAll());
    }
}