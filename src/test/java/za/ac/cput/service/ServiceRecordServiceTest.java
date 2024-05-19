package za.ac.cput.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.ServiceRecord;
import za.ac.cput.factory.ServiceRecordFactory;

import java.time.LocalDate;
/*  Completed By Malesela Modiba
    19 May 2024
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class ServiceRecordServiceTest {
    @Autowired
    private ServiceRecordService serviceRecordService;
    private ServiceRecord serviceRecord = ServiceRecordFactory.buildServiceRecord(0242401, LocalDate.of(2024, 3, 25), "Normal Service", "Oil Change ect...",
            5000, "Micheal Scott", LocalDate.of(2024, 6, 25), "123FG73287TY2");

    @Test
    void a_create() {
    ServiceRecord createdServiceRecord = serviceRecordService.create(serviceRecord);
    assertEquals(serviceRecord.getserviceID(),createdServiceRecord.getserviceID());
    System.out.println("Created Service Record: " + createdServiceRecord);
    }
    @Test
    void b_read() {
        ServiceRecord read = serviceRecordService.read(serviceRecord.getserviceID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }
        @Test
        void c_update(){
        ServiceRecord newServiceRecord = new ServiceRecord.Builder().copy(serviceRecord).setVin("123GH92849jy3").build();
        ServiceRecord updated = serviceRecordService.update(newServiceRecord);
        assertNotNull(updated);
        System.out.println(updated);
    }
    @Test
    @Disabled
    void e_delete(){
        serviceRecordService.delete(serviceRecord.getserviceID());
        System.out.println("Successfully deleted");
    }
    @Test
    void d_getAll(){
        System.out.println(serviceRecordService.getAll());
    }
}