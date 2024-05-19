package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Login;

import static org.junit.jupiter.api.Assertions.assertNotNull;
/**
 * LoginFactoryTest.java
 * Login factory test class
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 19 May 2024
 */
public class LoginFactoryTest {
    @Test
    void buildLogin(){
        Login login = LoginFactory.buildLogin(122,"sasa@gmail.com","password");
        assertNotNull(login);
        System.out.println(login.toString());

    }
    @Test
    void buildLoginFailWithEmail(){
        Login login = LoginFactory.buildLogin(122,"sasagmail.com","password");
        assertNotNull(login);
        System.out.println(login.toString());

    }
    @Test
    void buildLoginFailWithPassword(){
        Login login = LoginFactory.buildLogin(122, "sasa@gmail.com","wewe");
        assertNotNull(login);
        System.out.println(login.toString());
    }
}
