package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Category;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * CategoryFactoryTest.java
 * This is the factory test class
 * @author Thandolwethu Khoza (221797289)
 * Date: 24 March 2024
 */

public class CategoryFactoryTest {
        @Test
        public void testBuildCategory() {
            int categoryID = 1;
            String description = "Compact car";
            int numberOfAvailable = 10;
            String carSize = "Medium";
            String carType = "Sedan";
            int brandID = 1;

            Category category = CategoryFactory.buildCategory(categoryID, description, numberOfAvailable, carSize, carType, brandID);

            assertNotNull(category);

            assertEquals(categoryID, category.getCategoryID());
            assertEquals(description, category.getDescription());
            assertEquals(numberOfAvailable, category.getNumberOfAvailable());
            assertEquals(carSize, category.getCarSize());
            assertEquals(carType, category.getCarType());
            assertEquals(brandID, category.getBrandID());

            System.out.println(category);
        }

    }

