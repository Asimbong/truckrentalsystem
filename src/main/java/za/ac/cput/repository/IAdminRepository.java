package za.ac.cput.repository;

import za.ac.cput.domain.Admin;

import java.util.List;
/**
 * IAdminRepository.java
 * This is the repository interface
 * @aurthor Asimbonge Mbende (221090754)
 * Date: 22 March 2024
 */
public interface IAdminRepository extends IRepository<Admin,String> {
    List<Admin> getAll();
}
