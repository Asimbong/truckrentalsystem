package za.ac.cput.factory;

import za.ac.cput.domain.Brand;
import za.ac.cput.util.Helper;
/**
 *BrandFactory.java
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 21 March 2024
 */
public class BrandFactory {

    public static Brand createBrand(int brandId, String brandName, String color) {
        if (Helper.isNullOrEmpty(brandName) || Helper.isNullOrEmpty(model) || Helper.isNullOrEmpty(color)) {
            return null;
        }

        return new Brand.Builder()
                .setBrandId(brandId)
                .setBrandName(brandName)
                .setColor(color)
                .build();
    }
}
