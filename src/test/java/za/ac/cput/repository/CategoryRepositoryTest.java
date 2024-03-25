package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Category;


import static org.junit.jupiter.api.Assertions.*;

public class CategoryRepositoryTest {
    private CategoryRepository categoryRepository;

    @BeforeEach
    void setUp() {
        categoryRepository = (CategoryRepository) CategoryRepository.getCategoryRepository();
        categoryRepository.create(new Category.Builder()
                .setCategoryID(1)
                .setDescription("Test Category 1")
                .setNumberOfAvailable(5)
                .setCarSize("Compact")
                .setCarType("Sedan")
                .setBrandID(1001)
                .build());
        categoryRepository.create(new Category.Builder()
                .setCategoryID(2)
                .setDescription("Test Category 2")
                .setNumberOfAvailable(3)
                .setCarSize("Medium")
                .setCarType("SUV")
                .setBrandID(1002)
                .build());

    }

    @Test
    void getAll() {
        System.out.println(categoryRepository.getAll() + "\n");
        System.out.println(categoryRepository);
    }

    @Test
    void create() {
        Category newCategory = new Category.Builder()
                .setCategoryID(3)
                .setDescription("Test Category 3")
                .setNumberOfAvailable(4)
                .setCarSize("Large")
                .setCarType("Hatchback")
                .setBrandID(1003)
                .build();
        Category createdCategory = categoryRepository.create(newCategory);
        assertEquals(newCategory, createdCategory);
    }


//    @Test
//    void Read() {
//
//    }


//    @Test
//    void update() {
//
//    }

//    @Test
//    void delete() {
//
//    }

}

