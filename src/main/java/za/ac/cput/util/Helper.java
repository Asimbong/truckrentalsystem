package za.ac.cput.util;

import java.util.UUID;

/**
 * Helper.java
 * This is the util class
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 20 March 2024
 */
public class Helper {
    public static boolean isNullOrEmpty(String s) {
        if (s == null || s.isEmpty())
            return true;
        return false;
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        if (email == null) {
            return false;
        }
        return email.matches(emailRegex);
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }

}
