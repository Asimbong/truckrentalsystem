package za.ac.cput.repository;

import za.ac.cput.domain.Customer;

import java.util.List;
/**
 * ICustomerRepository.java
 * This is the repository interface
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 22 March 2024
 */
public interface ICustomerRepository extends IRepository<Customer,String> {
    List<Customer>getAll();
}
