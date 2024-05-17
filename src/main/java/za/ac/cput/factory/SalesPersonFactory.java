package za.ac.cput.factory;

import za.ac.cput.domain.SalesPerson;
import za.ac.cput.util.Helper;
/*  Completed By Malesela Modiba
    17 May 2024
 */
public class SalesPersonFactory {
    public static SalesPerson buildSalesPerson(String employeeNumber,
                                               String firstName,
                                               String lastName,
                                               String email,
                                               double wages,
                                               int hours,
                                               String customersAssisted){
       if (Helper.isNullOrEmpty(employeeNumber)
           || Helper.isNullOrEmpty(firstName)
           || Helper.isNullOrEmpty(lastName)
           || Helper.isNullOrEmpty(email)
           || !Helper.isValidEmail(email)
           || Helper.isDoubleNotNull(wages)
           || Helper.isIntNotValid(hours)
           ||Helper.isNullOrEmpty(customersAssisted)){
           return null;
       }


       return new SalesPerson.Builder().setEmployeeNumber(employeeNumber)
               .setFirstName(firstName)
               .setLastName(lastName)
               .setEmail(email)
               .setWages(wages)
               .setHours(hours)
               .setCustomersAssisted(customersAssisted)
               .build();
    }
}
