package za.ac.cput.factory;



import za.ac.cput.domain.LoginDetails;
import za.ac.cput.util.Helper;

import java.time.LocalDate;


/**
 * LoginDetailsFactory.java
 * This is the factory class
 * @aurthor Zukhanye Anele Mene  (219404275)
 * Date: 21 March 2024
 */
public class LoginDetailsFactory {
    public static LoginDetails buildLoginDetails(String username, String password) {
        // Check if any required field is null or empty
        if (Helper.isNullOrEmpty((username)) ||
                Helper.isNullOrEmpty((password)))
                {
            return null;
        }
        // Return a new LoginDetails object built using the Builder pattern
        return new LoginDetails.Builder()
                .setUsername(username)
                .setPassword(password)
                .build();
    }

//This will properly create LoginDetails objects with the provided parameters.
}


