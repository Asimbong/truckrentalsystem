package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;
import za.ac.cput.domain.LoginDetails;

import static org.junit.jupiter.api.Assertions.assertNotNull;
/**
 * LoginDetailsFactoryTest.java
 * This is the factory test class
 * @aurthor Zukhanye Anele Mene  (219404275)
 * Date: 24 March 2024
 */
class LoginDetailsFactoryTest {

    @Test
    public void createLoginDetails() {
        LoginDetails loginDetails = LoginDetailsFactory.buildLoginDetails("Benzo", "75897");
        assertNotNull(loginDetails);
        System.out.println(loginDetails);
    }
}
