package za.ac.cput.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.ServiceRecord;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
/**
 * ServiceRecordFactoryTest.java
 * This is the factory test class
 * @aurthor Malesela Modiba (222140275)
 * Date: 04 May 2024
 */

 public class ServiceRecordFactoryTest {
    @Test
     void buildServiceRecord() {
        ServiceRecord serviceRecord = ServiceRecordFactory.buildServiceRecord(0242401, LocalDate.of(2024,3,25), "Normal Service", "Oil Change ect...",
                5000, "Micheal Scott", LocalDate.of(2024,6,25),"123FG73287TY2");
        assertNotNull(serviceRecord);
        System.out.println(serviceRecord.toString());

        }
    @Test
    void buildServiceRecordWithFail() {
        ServiceRecord serviceRecord = ServiceRecordFactory.buildServiceRecord(-1, LocalDate.of(2024,3,25), "Normal Service", "Oil Change ect...",
                5000, "Damian", LocalDate.of(202,6,25),"1232NH237875KJ");
        assertNotNull(serviceRecord);
        System.out.println(serviceRecord.toString());
    }
}
