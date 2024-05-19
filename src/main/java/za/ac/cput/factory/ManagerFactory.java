package za.ac.cput.factory;
import za.ac.cput.domain.Manager;
import za.ac.cput.util.Helper;
/**
 *Truck.java
 * This is Truck Domain program
 * @aurthor Ayanda Phumzile Khoza (218057172)
 * Date: 07 May 2024
 * */

public class ManagerFactory {
    public static Manager buildManager(String employeeNumber,String firstName, String lastName, String email, double wages, int hours){
        if (Helper.isNullOrEmpty(employeeNumber)
                || Helper.isNullOrEmpty(firstName)
                || Helper.isNullOrEmpty(lastName)
                || Helper.isNullOrEmpty(email)
                || !Helper.isValidEmail(email)
                || Helper.isDoubleNotNull(wages)
                || Helper.isIntNotValid(hours)){
            return null;}
        return new Manager.Builder().setEmployeeNumber(employeeNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setWages(wages)
                .setHours(hours)
                .build();
    }
}
