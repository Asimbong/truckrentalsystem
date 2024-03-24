package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Admin;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;
/**
 * CustomerRepositoryTest.java
 * This is the repository test program
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 24 March 2024
 */
@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerRepositoryTest {
private static CustomerRepository customerRepository= (CustomerRepository) CustomerRepository.getCustomerRepository();
private static final Customer customer= CustomerFactory.buildCustomer("David","Smith","dsmith@gmail.com","1234567890123","12345678901","0123456789",123);

    private static final Customer.Builder customerBuilder = new Customer.Builder(); //Create an instance of Customer.Builder
@Test
void a_create() {
    System.out.println("------------------------- Create Customer ----------------------------------------");
    Customer customer1 = customerRepository.create(customer);
    assertEquals(customer, customer1.getIdNumber());
    System.out.println("Create Customer: " + customer1 + "\n");

}

    @Test
    void b_read() {

        System.out.println("------------------------- Read Customer ----------------------------------------");

        Customer readCustomer = customerRepository.read(customer.getIdNumber());
        assertNotNull(readCustomer);
        System.out.println("Read Admin: " + readCustomer + "\n");

    }

    @Test
    void c_update() {
        System.out.println("------------------------- Update Customer ----------------------------------------");
        Customer updatedCustomer = customerBuilder.copy(customer).setEmail("dsmith@gmail.com").setTelephoneNo("0124536987").build();
        assertNotNull(customerRepository.update(updatedCustomer));
        System.out.println("Update Customer: " + updatedCustomer + "\n");
    }

    @Test
    void d_delete() {
        System.out.println("------------------------- Delete Customer ----------------------------------------");
        boolean success = customerRepository.delete(customer.getIdNumber());
        assertTrue(success);
        System.out.println("Deleted Customer: " + success + "\n");
    }

    @Test
    void e_getAll() {
        System.out.println("------------------------- Display all Customer ----------------------------------------");
        System.out.println("Display All: ");
        System.out.println(customerRepository.getAll() + "\n");
    }

}