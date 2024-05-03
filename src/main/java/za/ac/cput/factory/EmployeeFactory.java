package za.ac.cput.factory;

import za.ac.cput.domain.Employee;
import za.ac.cput.util.Helper;
/**
 * EmployeeFactory.java
 * This is the factory class
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 03 May 2024
 */
public class EmployeeFactory {
    public static Employee buildEmployee(String employeeNumber, String firstName, String lastName,
                                         String email, String employeeType) {
        if (Helper.isNullOrEmpty(employeeNumber) ||
                Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName) ||
                Helper.isNullOrEmpty(email) || !Helper.isValidEmail(email) ||
                Helper.isNullOrEmpty(employeeType))
            return null;
        return new Employee.Builder().setEmployeeNumber(employeeNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setEmployeeType(employeeType)
                .build();
    }

}
