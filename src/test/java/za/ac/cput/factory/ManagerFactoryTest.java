package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Manager;
import za.ac.cput.domain.SalesPerson;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFactoryTest {

    @Test
    void buildManager() {
        Manager manager = ManagerFactory.buildManager("13142412",
                "Malesela",
                "Modiba",
                "Modiba@gmail.com",
                500,
                10);
        assertNotNull(manager);
        System.out.println(manager);
    }@Test
    void buildManagerFail() {
        Manager manager = ManagerFactory.buildManager("",
                "Malesela",
                "Modiba",
                "Modibagmail.com",
                500,
                10);
        assertNotNull(manager);
        System.out.println(manager);
    }
}