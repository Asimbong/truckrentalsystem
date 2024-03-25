package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Admin;

import static org.junit.jupiter.api.Assertions.assertNotNull;
/**
 * AdminFactoryTest.java
 * This is the factory test class
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 24 March 2024
 */
class AdminFactoryTest {

    @Test
    public void createAdmin() {
        Admin admin = AdminFactory.buildAdmin("111", "Asimbonge", "Mbende", "ambende@gmail.com");
        assertNotNull(admin);
        System.out.println(admin);
    }
}