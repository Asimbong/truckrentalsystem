package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Category;


import java.sql.SQLOutput;

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
                .setTruckSize("Compact")
                .setTruckType("Sedan")
                .setBrandID(1001)
                .build());
        categoryRepository.create(new Category.Builder()
                .setCategoryID(2)
                .setDescription("Test Category 2")
                .setNumberOfAvailable(3)
                .setTruckSize("Medium")
                .setTruckType("SUV")
                .setBrandID(1002)
                .build());

    }

    @Test
    void getAll() {
        System.out.println(categoryRepository.getAll() + "\n");
        System.out.println(categoryRepository);
    }

    @Test
    void a_create() {
        Category newCategory = new Category.Builder()
                .setCategoryID(3)
                .setDescription("Test Category 3")
                .setNumberOfAvailable(4)
                .setTruckSize("Large")
                .setTruckType("Hatchback")
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
//    void e_delete() {
//        boolean success = categoryRepository.delete(categoryRepository.toString());
//        assertEquals(true, success);
//        System.out.println(("Deleted " + success));
//    }

}

