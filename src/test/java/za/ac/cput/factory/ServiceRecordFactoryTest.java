package za.ac.cput.factory;
/**
 * ServiceRecordFactoryTest.java
 * This is the factory test class
 * @aurthor Malesela Modiba (222140275)
 * Date: 04 May 2024
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.ServiceRecord;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ServiceRecordFactoryTest {
    @Test
    public void BuildServiceRecord() {

        ServiceRecord serviceRecord = ServiceRecordFactory.buildServiceRecord(001, LocalDate.of(2024,3,25), "Normal Service", "Oil Change ect...",
                5000, "Micheal Scott", LocalDate.of(2024,6,25),"123FG73287TY2");
        assertNotNull(serviceRecord);
        System.out.println(serviceRecord.toString());

    }
    @Test
    void buildEmployeeWithFail() {
        ServiceRecord serviceRecord = ServiceRecordFactory.buildServiceRecord(001, LocalDate.of(2024,3,25), "Normal Service", "Oil Change ect...",
                5000, "", LocalDate.of(2024,6,25),"123FG73287TY2");
        assertNotNull(serviceRecord);
        System.out.println(serviceRecord.toString());
    }
}
