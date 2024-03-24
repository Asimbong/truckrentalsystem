package za.ac.cput.repository;

import za.ac.cput.domain.Category;

import java.util.List;

/**
 * ICategoryRepository.java
 * This is the repository interface
 * @author Thandolwethu Khoza (221797289)
 * Date: 24 March 2024
 */

public interface ICategoryRepository extends IRepository<Category,String> {
    List<Category> getAll();
}
