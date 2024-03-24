package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Admin;
import za.ac.cput.factory.AdminFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * AdminRepositoryTest.java
 * This is the repository test program
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 24 March 2024
 */
@TestMethodOrder(MethodOrderer.MethodName.class) // help in testing our CRUD method in Alphanumeric order
class AdminRepositoryTest {
    private static AdminRepository adminRepository = (AdminRepository) AdminRepository.getRepository();

    private static final Admin admin = AdminFactory.buildAdmin("111", "Asimbonge", "Mbende", "ambende@gmail.com");

    private static final Admin.Builder adminBuilder = new Admin.Builder(); //Create an instance of Admin.Builder

    @Test
    void a_create() {
        System.out.println("------------------------- Create Admin ----------------------------------------");
        Admin admin1 = adminRepository.create(admin);
        assertEquals(admin, admin1.getAdminID());
        System.out.println("Create Admin: " + admin1 + "\n");

    }

    @Test
    void b_read() {

        System.out.println("------------------------- Read Admin ----------------------------------------");

        Admin readAdmin = adminRepository.read(admin.getAdminID());
        assertNotNull(readAdmin);
        System.out.println("Read Admin: " + readAdmin + "\n");

    }

    @Test
        // From this code I get this error:"non-static method 'copy(za.ac.cput.Admin)' cannot be referenced from a non-static context"
//    void c_update(){
//        System.out.println("------------------------- Update Admin ----------------------------------------");
//        Admin updatedAdmin=Admin.Builder.copy(admin).setAdminName("Asi").setAdminSurname("Mbende").setEmail("ambende@yahoo.com").build();
//        assertNotNull(adminRepository.update(updatedAdmin));
//        System.out.println("Update Admin: " +updatedAdmin+"\n");
//
//
//    }
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
