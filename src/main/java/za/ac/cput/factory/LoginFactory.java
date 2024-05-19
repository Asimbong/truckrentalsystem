package za.ac.cput.factory;

import za.ac.cput.domain.Login;
import za.ac.cput.util.Helper;

/**
 * LoginFactory.java
 * Login factory class
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 19 May 2024
 */
public class LoginFactory {
    public static Login buildLogin(int customerId, String email, String password) {
        if (Helper.isIntNotValid(customerId)|| Helper.isNullOrEmpty(email) ||
                Helper.isNullOrEmpty(password)||!Helper.isValidEmail(email) )
            return null;

        return new Login.Builder()
                .setCustomerId(customerId)
                .setEmail(email)
                .setPassword(password)
                .build();
    }
}
