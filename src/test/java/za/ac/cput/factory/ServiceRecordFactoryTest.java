package za.ac.cput.factory;
/**
 * ServiceRecordFactoryTest.java
 * This is the factory test class
 * @aurthor Malesela Modiba (222140275)
 * Date: 25 March 2024
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.ServiceRecord;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ServiceRecordFactoryTest {
    @Test
    public void createCustomer() {

        ServiceRecord serviceRecord = ServiceRecordFactory.buildServiceRecord(0001, LocalDate.ofEpochDay(2024-03-25), "Normal Service", "Oil Change ect...",
                5000, "Micheal Scott", LocalDate.ofEpochDay(2024-06-25));
        assertNotNull(serviceRecord);
        System.out.println(serviceRecord);

    }
}
