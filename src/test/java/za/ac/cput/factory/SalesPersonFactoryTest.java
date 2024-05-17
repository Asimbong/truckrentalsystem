package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.SalesPerson;

import static org.junit.jupiter.api.Assertions.assertNotNull;
/*  Completed By Malesela Modiba
    17 May 2024
 */
public class SalesPersonFactoryTest {
    @Test
    void testBuildSalesPerson() {
        SalesPerson salesPerson = SalesPersonFactory.buildSalesPerson("13142412",
                "Malesela",
                "Modiba",
                "Modiba@gmail.com",
                500,
                10,
                "4 Customers");
        assertNotNull(salesPerson);
        System.out.println(salesPerson);
    }

    @Test
    void testBuildSalesPersonFail() {
        SalesPerson salesPerson = SalesPersonFactory.buildSalesPerson("13142412",
                "Malesela",
                "Modiba",
                "Modiba@gmail.com",
                -500,
                10,
                "4 Customers");
        assertNotNull(salesPerson);
        System.out.println(salesPerson);
    }
}
