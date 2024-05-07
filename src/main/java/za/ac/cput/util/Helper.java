package za.ac.cput.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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

    public static boolean isIntNotValid(int i) {    //checks int
        if (i < 0)
            return true;
            return false;
    }

    public static boolean isDoubleNotNull(double d) {    //checks double
        if (d < 0)
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

    // Inner class for date validation using LocalDate
    public static class DateValidatorUsingLocalDate {
        private DateTimeFormatter dateFormatter;

        public DateValidatorUsingLocalDate(DateTimeFormatter dateFormatter) {
            this.dateFormatter = dateFormatter;
        }

        public boolean isValid(String dateStr) {
            try {
                LocalDate.parse(dateStr, this.dateFormatter);
                return true;
            } catch (DateTimeParseException e) {
                return false;
            }
        }

        // Additional method for validating date with custom format
        public boolean isValidWithFormat(String dateStr, String format) {
            try {
                DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern(format);
                LocalDate.parse(dateStr, customFormatter);
                return true;
            } catch (DateTimeParseException e) {
                return false;
            }
        }
    }
}
