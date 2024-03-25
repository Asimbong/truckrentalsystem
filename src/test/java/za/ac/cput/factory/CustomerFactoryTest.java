package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.assertNotNull;
/**
 * CustomerFactoryTest.java
 * This is the factory test class
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 24 March 2024
 */
class CustomerFactoryTest {
    @Test
    public void createCustomer() {

        Customer customer = CustomerFactory.buildCustomer("David", "Smith", "dsmith@yahoo.com", "1234567890123",
                "12345678910", "0123456789", 123);
        assertNotNull(customer);
        System.out.println(customer);

    }
}