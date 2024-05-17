package za.ac.cput.factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Manager;
import static org.junit.jupiter.api.Assertions.*;

/**
 *Truck.java
 * This is Truck Domain program
 * @aurthor Ayanda Phumzile Khoza (218057172)
 * Date: 07 May 2024
 * */


class ManagerFactoryTest {
    @Test
    void createManager() {
        Manager createManager = ManagerFactory.buildManager("Mandla", "Masinge", "phumi@1998");
        assertNull(createManager);
        System.out.println("Created: " + createManager);
    }
}

