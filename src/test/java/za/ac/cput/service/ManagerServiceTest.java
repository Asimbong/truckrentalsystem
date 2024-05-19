package za.ac.cput.service;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Insurance;
import za.ac.cput.domain.Manager;
import za.ac.cput.domain.Truck;
import za.ac.cput.factory.ManagerFactory;
import za.ac.cput.factory.TruckFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class
ManagerServiceTest {

    @Autowired
    private ManagerService managerService;
    private Manager manager = ManagerFactory.buildManager("Mandla", "Masinge", "phumi@1998"
            );

    @Test
    void a_create() {
        Manager createdManager = managerService.create(manager);
        assertEquals(manager.getFirstName(), createdManager.getFirstName());
        System.out.println("Created Manager: " + createdManager);
    }

    @Test
    void b_read() {
        Manager read = managerService.read(manager.getFirstName());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Manager newManager = new Manager.Builder().copy(manager).setFirstName("Mandla").build();
        Manager updated = managerService.update(newManager);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Disabled
    void e_delete() {
        managerService.delete(manager.getFirstName());
        System.out.println("Successfully deleted manager");
    }

    @Test
    void d_getAll() {
        System.out.println(managerService.getAll());
    }
}