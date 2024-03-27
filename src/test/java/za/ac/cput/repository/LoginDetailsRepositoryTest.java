package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.LoginDetails;
import za.ac.cput.factory.LoginDetailsFactory;
import za.ac.cput.repository.LoginDetailsRepository;

import static org.junit.jupiter.api.Assertions.*;

/**
 * LoginDetailsRepositoryTest.java
 * This is the repository test program
 * @aurthor Zukhanye Anele Mene (219404275)
 * Date: 26 March 2024
 */
@TestMethodOrder(MethodOrderer.MethodName.class) // help in testing our CRUD method in Alphanumeric order
class LoginDetailsRepositoryTest {

    private static LoginDetailsRepository loginDetailsRepository ;

    private  LoginDetails loginDetails ;

    private static final LoginDetails.Builder adminBuilder = new LoginDetails.Builder();
    @BeforeEach
    void setUp() {
        loginDetails = LoginDetailsFactory.buildLoginDetails("Benzo", "75897");
        loginDetailsRepository =  (LoginDetailsRepository) LoginDetailsRepository.getRepository();
        loginDetailsRepository.loginDetailsList.add(loginDetails);
    }
    @Test
    void a_create() {
        System.out.println("------------------------- Create Admin ----------------------------------------");
        LoginDetails loginDetails1 = loginDetailsRepository.create(loginDetails);
        assertEquals(loginDetails, loginDetails1);
        System.out.println("Create Admin: " + loginDetails1 + "\n");

    }

    @Test
    void b_read() {
        System.out.println("------------------------- Read LoginDetails ----------------------------------------");

        if (loginDetails.getUsername() != null) {
            LoginDetails readLoginDetails = loginDetailsRepository.read(loginDetails.getUsername());
            assertNotNull(readLoginDetails, "The read loginDetails should not be null");
            assertEquals(loginDetails, readLoginDetails, "The read Logins should match the Logins in the repository");
            System.out.println("Read LoginDetails: " + readLoginDetails + "\n");
        } else {
            System.out.println("Username is null, skipping read test.");
        }
    }

    @Test
    void c_update() {
        System.out.println("------------------------- Update LoginDetails ----------------------------------------");
        LoginDetails updatedLoginDetails = adminBuilder.copy(loginDetails).setUsername("Bennie").setPassword("73637").build();
        System.out.println("Update LoginDetails: " + updatedLoginDetails + "\n");
    }

    @Test
    void d_delete() {
        System.out.println("------------------------- Delete LoginDetails ----------------------------------------");
        if (loginDetails != null && loginDetails.getUsername() != null) {
            boolean success = loginDetailsRepository.delete(loginDetails.getUsername());
            System.out.println("Deleted LoginDetails: " + success + "\n");
            assertTrue(success);
        } else {
            System.out.println("Unable to delete admin. adminID is null.\n");
        }
    }

    @Test
    void e_getAll() {
        System.out.println("------------------------- Display all LoginDetails ----------------------------------------");
        System.out.println("Display All: ");
        System.out.println(loginDetailsRepository.getAll() + "\n");
    }
}
