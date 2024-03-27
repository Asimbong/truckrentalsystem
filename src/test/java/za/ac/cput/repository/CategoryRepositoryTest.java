package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Category;
import za.ac.cput.factory.CategoryFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * CategoryRepositoryTest.java
 * This is the repository test class
 * @author Thandolwethu Khoza (221797289)
 * Date: 24 March 2024
 */

@TestMethodOrder(MethodOrderer.MethodName.class)
public class CategoryRepositoryTest {
    private static CategoryRepository categoryRepository = (CategoryRepository) CategoryRepository.getCategoryRepository();
    private static final Category category = CategoryFactory.buildCategory(2, "Test Category 1", 5 , "Large", "SUV", 1002);

    private static final Category.Builder categoryBuilder = new Category.Builder();

    @Test
    void a_create() {
        System.out.println("------------------------- Create Category ----------------------------------------");
        Category category1 = categoryRepository.create(category);
        assertNotNull(category1, "Failed to create category");
        assertEquals(category, category1, "Created category is not equal to expected category");
        System.out.println("Create Category: " + category1 + "\n");
    }

    @Test
    void b_read() {
        System.out.println("------------------------- Read Category ----------------------------------------");
        Category readCategory = categoryRepository.read(category.getCategoryID());
        assertNotNull(readCategory, "Failed to read category");
        assertEquals(category, readCategory, "Read category does not match expected category");
        System.out.println("Read category: " + readCategory + "\n");
    }

    @Test
    void c_update() {
        System.out.println("------------------------- Update Category----------------------------------------");
        Category updatedCategory;
        updatedCategory = categoryBuilder.setNumberOfAvailable(4).setTruckSize("Medium").build();
        System.out.println("Update Truck: " + updatedCategory + "\n");
    }

    @Test
    void d_delete() {
        System.out.println("------------------------- Delete Category ----------------------------------------");
        boolean success = categoryRepository.delete(String.valueOf(category.getCategoryID()));
        System.out.println("Deleted Category: " + success + "\n");
    }

    @Test
    void e_getAll() {
        System.out.println("------------------------- Display Categories ----------------------------------------");
        System.out.println("Display All: ");
        System.out.println(categoryRepository.getAll() + "\n");
    }
}



