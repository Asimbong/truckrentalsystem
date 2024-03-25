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

//    @Test
//    void c_update() {
//        System.out.println("------------------------- Update Category----------------------------------------");
//        Category updatedCategory = categoryBuilder.copy(category).setNumberOfAvailable(4).setTruckSize("Medium").build();
//        Category updatedCategory1= categoryRepository.update(updatedCategory);
//        assertNotNull(updatedCategory1, "Failed to update truck");
//        assertEquals(updatedCategory, updatedCategory1, "Updated truck does not match expected truck");
//        System.out.println("Update Truck: " + updatedCategory + "\n");
//    }

    @Test
    void d_delete() {
        System.out.println("------------------------- Delete Category ----------------------------------------");
        boolean success = categoryRepository.delete(String.valueOf(category.getCategoryID()));
        assertTrue(success, "Failed to delete category");
        System.out.println("Deleted Category: " + success + "\n");
    }

    @Test
    void e_getAll() {
        System.out.println("------------------------- Display Categories ----------------------------------------");
        System.out.println("Display All: ");
        System.out.println(categoryRepository.getAll() + "\n");
    }
}
//    private CategoryRepository;
//
//    @BeforeEach
//    void setUp() {
//        categoryRepository = (CategoryRepository) CategoryRepository.getCategoryRepository();
//        categoryRepository.create(new Category.Builder()
//                .setCategoryID(1)
//                .setDescription("Test Category 1")
//                .setNumberOfAvailable(5)
//                .setTruckSize("Compact")
//                .setTruckType("Sedan")
//                .setBrandID(1001)
//                .build());
//        categoryRepository.create(new Category.Builder()
//                .setCategoryID(2)
//                .setDescription("Test Category 2")
//                .setNumberOfAvailable(3)
//                .setTruckSize("Medium")
//                .setTruckType("SUV")
//                .setBrandID(1002)
//                .build());
//
//    }
//
//    @Test
//    void getAll() {
//        System.out.println(categoryRepository.getAll() + "\n");
//        System.out.println(categoryRepository);
//    }
//
//    @Test
//    void a_create() {
//        Category newCategory = new Category.Builder()
//                .setCategoryID(3)
//                .setDescription("Test Category 3")
//                .setNumberOfAvailable(4)
//                .setTruckSize("Large")
//                .setTruckType("Hatchback")
//                .setBrandID(1003)
//                .build();
//        Category createdCategory = categoryRepository.create(newCategory);
//        assertEquals(newCategory, createdCategory);
//    }
//

//    @Test
//    void b_Read() {
//        System.out.println(categoryRepository.read() + "\n");
//        System.out.println(categoryRepository);
//    }


//    @Test
//    void update() {
//
//    }

//    @Test
//    void e_delete() {
//        boolean success = categoryRepository.delete(categoryRepository.toString());
//        assertEquals(true, success);
//        System.out.println(("Deleted " + success));
//    }


