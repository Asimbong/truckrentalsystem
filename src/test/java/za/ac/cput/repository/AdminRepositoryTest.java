package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Admin;
import za.ac.cput.factory.AdminFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * AdminRepositoryTest.java
 * This is the repository test program
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 24 March 2024
 */
@TestMethodOrder(MethodOrderer.MethodName.class) // help in testing our CRUD method in Alphanumeric order
class AdminRepositoryTest {

    private static AdminRepository adminRepository;

    private  Admin admin ;

    private static final Admin.Builder adminBuilder = new Admin.Builder(); //Create an instance of Admin.Builder
    @BeforeEach
    void setUp() {
        admin = AdminFactory.buildAdmin("111", "Asimbonge", "Mbende", "ambende@gmail.com");
        adminRepository =  (AdminRepository) AdminRepository.getRepository();
        adminRepository.adminList.add(admin); // Initialize adminRepository with admin object
    }
    @Test
    void a_create() {
        System.out.println("------------------------- Create Admin ----------------------------------------");
        Admin admin1 = adminRepository.create(admin);
        assertEquals(admin, admin1);
        System.out.println("Create Admin: " + admin1 + "\n");

    }

    @Test
    void b_read() {

        System.out.println("------------------------- Read Admin ----------------------------------------");

        Admin readAdmin = adminRepository.read(admin.getAdminID());
        assertNotNull(readAdmin, "The read admin should not be null");
        assertEquals(admin, readAdmin,"The read admin should match the admin in the repository");
        System.out.println("Read Admin: " + readAdmin + "\n");

    }

    @Test
    void c_update() {
        System.out.println("------------------------- Update Admin ----------------------------------------");
        Admin updatedAdmin = adminBuilder.copy(admin).setAdminName("Asi").setAdminSurname("Mbende").setEmail("ambende@yahoo.com").build();
        assertNotNull(adminRepository.update(updatedAdmin));
        System.out.println("Update Admin: " + updatedAdmin + "\n");
    }

    @Test
    void d_delete() {
        System.out.println("------------------------- Delete Admin ----------------------------------------");
        boolean success = adminRepository.delete(admin.getAdminID());
        assertTrue(success);
        System.out.println("Deleted Admin: " + success + "\n");
    }

    @Test
    void e_getAll() {
        System.out.println("------------------------- Display all Admin ----------------------------------------");
        System.out.println("Display All: ");
        System.out.println(adminRepository.getAll() + "\n");
    }
}
