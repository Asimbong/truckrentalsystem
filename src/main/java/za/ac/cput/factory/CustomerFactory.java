package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Employee;
import za.ac.cput.util.Helper;
/**
 * CustomerFactory.java
 * This is the customer class
 * @aurthor Zukhanye Anele Mene  (219404275)
 * Date: 03 May 2024
 */
public class CustomerFactory {
    public static Customer buildCustomer(int customerID, String firstName, String lastName, String email, char license, String cellNo, int rentalID) {
        if (Helper.isNullOrEmpty(String.valueOf(customerID)) ||
                Helper.isNullOrEmpty(firstName) ||
                Helper.isNullOrEmpty(lastName) ||
                Helper.isNullOrEmpty(email) || !Helper.isValidEmail(email) ||
                Helper.isNullOrEmpty(String.valueOf(license)) ||
                Helper.isNullOrEmpty(cellNo) ||
                Helper.isNullOrEmpty(String.valueOf(rentalID)))

            return null;
        return new Customer.Builder().setCustomerID(customerID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setLicense(license)
                .setCellNo(cellNo)
                .setRentalID(rentalID)
                .build();
    }

}

