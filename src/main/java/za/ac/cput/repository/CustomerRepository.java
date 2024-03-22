package za.ac.cput.repository;

import za.ac.cput.domain.Customer;

import java.util.ArrayList;
import java.util.List;
/**
 * CustomerRepository.java
 * This is the repository program
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 22 March 2024
 */
public class CustomerRepository implements ICustomerRepository {
    private static ICustomerRepository customerRepository = null;

    private List<Customer> customerList;

    private CustomerRepository() {
        customerList = new ArrayList<Customer>();
    }

    public static ICustomerRepository getCustomerRepository() {
        if (customerRepository == null) {
            customerRepository = new CustomerRepository();
        }
        return customerRepository;
    }

    @Override
    public List<Customer> getAll() {
        return customerList;
    }

    @Override
    public Customer create(Customer customer) {
        boolean success = customerList.add(customer);
        if (success)
            return customer;
        return null;
    }

    @Override
    public Customer read(String id) {
        for (Customer customer : customerList) {
            if (customer.getIdNumber().equals(id))
                return customer;
        }
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        String customerID = customer.getIdNumber();
        if (delete(customerID)) {
            if (customerList.add(customer))
                return customer;
            else
                return null;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Customer customerToDelete = read(id);
        if (customerToDelete == null)
            return false;
        return (customerList.remove(customerToDelete));
    }
}
