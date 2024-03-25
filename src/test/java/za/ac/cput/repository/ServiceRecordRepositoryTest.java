package za.ac.cput.repository;
/**
 * ServiceRecordFactoryTest.java
 * This is the factory test class
 * @aurthor Malesela Modiba (222140275)
 * Date: 25 March 2024
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Admin;
import za.ac.cput.domain.ServiceRecord;
import za.ac.cput.factory.ServiceRecordFactory;

import java.time.LocalDate;
/**
 * ServiceRecordRepositoryTest.java
 * This is the repository test program
 * @aurthor Malesela Modiba (222140275)
 * Date: 24 March 2024
 */
import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

     class ServiceRecordRepositoryTest {
         private static ServiceRecordRepository serviceRecordRepository= (ServiceRecordRepository) ServiceRecordRepository.getServiceRecordRepository();
         private static final ServiceRecord serviceRecord= ServiceRecordFactory.buildServiceRecord(0001,LocalDate.ofEpochDay(2024-03-25),"Normal service","Every 3 month service",3000,"Micheal Scott",LocalDate.ofEpochDay(2024-06-25));

         private static final ServiceRecord.Builder serviceRecordBuilder = new ServiceRecord.Builder(); //Create an instance of ServiceRecord.Builder
         @Test
         void a_create() {
             System.out.println("------------------------- Create ServiceRecord ----------------------------------------");
             ServiceRecord serviceRecord1 = serviceRecordRepository.create(serviceRecord);
             assertEquals(serviceRecord, serviceRecord1);
             System.out.println("Create ServiceRecord: " + serviceRecord1 + "\n");

         }
    @Test
    void b_read() {

        System.out.println("------------------------- Read ServiceRecord ----------------------------------------");

        ServiceRecord readServiceRecord = serviceRecordRepository.read(serviceRecord.getVehicleID());
        assertNotNull(readServiceRecord);
        System.out.println("Read Admin: " + readServiceRecord + "\n");

    }
    @Test
    void c_update() {
        System.out.println("------------------------- Update ServiceRecord ----------------------------------------");
        ServiceRecord updatedServiceRecord = serviceRecordBuilder.copy(serviceRecord).setServiceType("Repair").setMechanic("Joseph Dary").build();
        assertNotNull(serviceRecordRepository.update(updatedServiceRecord));
        System.out.println("Update ServiceRecord: " + updatedServiceRecord + "\n");
    }
    @Test
    void d_delete() {
        System.out.println("------------------------- Delete ServiceRecord ----------------------------------------");
        boolean success = serviceRecordRepository.delete(serviceRecord.getDescription());
        assertTrue(success);
        System.out.println("Deleted ServiceRecord: " + success + "\n");
    }
    @Test
    void e_getAll() {
        System.out.println("------------------------- Display all ServiceRecord ----------------------------------------");
        System.out.println("Display All: ");
        System.out.println(serviceRecordRepository.getAll() + "\n");
    }
}
