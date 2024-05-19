package za.ac.cput.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.SalesPerson;
import za.ac.cput.factory.SalesPersonFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class SalesPersonServiceTest {
    @Autowired
    private SalesPersonService salesPersonService;
    private SalesPerson salesPerson = SalesPersonFactory.buildSalesPerson("13142412",
            "Malesela",
            "Modiba",
            "Modiba@gmail.com",
            500,
            10,
            "4 Customers");


    @Test
    void a_create(){
        SalesPerson createdSalesPerson = salesPersonService.create(salesPerson);
        assertEquals(createdSalesPerson.getEmployeeNumber(), createdSalesPerson.getEmployeeNumber());
        System.out.println("Created SalesPerson " + createdSalesPerson);
    }
    @Test
    void b_read(){
        SalesPerson read = salesPersonService.read(salesPerson.getEmployeeNumber());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }
    @Test
    void b_update(){
        SalesPerson newSalesPerson = new SalesPerson.Builder().copy(salesPerson).setHours(6).build();
        SalesPerson updated = salesPersonService.update(newSalesPerson);
        assertNotNull(updated);
        System.out.println(updated);
    }
    @Test
    @Disabled
    void e_delete(){
        salesPersonService.delete(salesPerson.getEmployeeNumber());
        System.out.println("Successfully deleted");
    }
    @Test
    void d_getAll(){
        System.out.println(salesPersonService.getAll());
    }
}
