package za.ac.cput.factory;

import za.ac.cput.domain.Category;
import za.ac.cput.util.Helper;

/**
 * CategoryFactory.java
 * This is the factory program
 * @author Thandolwethu Khoza (221797289)
 * Date: 21 March 2024
 */

public class CategoryFactory {

    public static Category buildCategory(int categoryID, String description, int numberOfAvailable, String carSize, String carType, int brandID) {
        if (Helper.isNullOrEmpty(String.valueOf(categoryID)) || Helper.isNullOrEmpty(description) || Helper.isNullOrEmpty(String.valueOf(numberOfAvailable)) || Helper.isNullOrEmpty(carSize)
                || Helper.isNullOrEmpty(carType) || Helper.isNullOrEmpty(String.valueOf(brandID)))
            return null;

          return new Category.Builder().setCategoryID(categoryID).setDescription(description)
                .setNumberOfAvailable(numberOfAvailable).setCarSize(carSize).setCarType(carType)
                .setBrandID(brandID).build();
    }
    public static Category buildCategory(String description, String carType, int brandID) {
        if (Helper.isNullOrEmpty(description) || Helper.isNullOrEmpty(carType) || Helper.isNullOrEmpty(String.valueOf(brandID)))
            return null;

        int categoryID = Integer.parseInt(Helper.generateId());

        return new Category.Builder().setCategoryID(categoryID).setDescription(description)
                .setCarType(carType).setBrandID(brandID).build();
    }
}
