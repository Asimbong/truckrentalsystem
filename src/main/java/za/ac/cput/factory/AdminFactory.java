package za.ac.cput.factory;

import za.ac.cput.domain.Admin;
import za.ac.cput.util.Helper;

/**
 * AdminFactory.java
 * This is the factory class
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 20 March 2024
 */
public class AdminFactory {
    public static Admin buildAdmin(String adminID, String adminName, String adminSurname, String email) {
        if (Helper.isNullOrEmpty(String.valueOf(adminID)) || Helper.isNullOrEmpty(adminName) || Helper.isNullOrEmpty(adminSurname) ||
                Helper.isNullOrEmpty(email))
            return null;
        return new Admin.Builder().setAdminID(adminID).setAdminName(adminName)
                .setAdminSurname(adminSurname).setEmail(email).build();
    }

    public static Admin buildAdmin(String firstName, String lastName) {
        if (Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName))
            return null;
        String adminId = Helper.generateId();
        return new Admin.Builder().setAdminID((adminId)).setAdminName(firstName)
                .setAdminSurname(lastName).build();
    }
}
