package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;

import static org.junit.jupiter.api.Assertions.assertNotNull;
/**
 * EmployeeFactoryTest.java
 * This is the factory test class
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 03 May 2024
 */
class EmployeeFactoryTest {

    @Test
    void buildEmployee() {
        Employee employee = EmployeeFactory.buildEmployee("20240503", "Asimbonge", "Mbende",
                "mbende@gmail.com", "Administrator");
        assertNotNull(employee);
        System.out.println(employee.toString());
    }

    @Test
    void buildEmployeeWithFail() {
        Employee employee = EmployeeFactory.buildEmployee("20240503", "Asimbonge", "Mbende",
                "mbende@.com", "Administrator");
        assertNotNull(employee);
        System.out.println(employee.toString());
    }
}
