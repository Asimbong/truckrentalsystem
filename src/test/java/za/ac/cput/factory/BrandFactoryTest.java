package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Brand;

import static org.junit.jupiter.api.Assertions.*;
/**
 *BrandFactoryTest.java
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 26 March 2024
 */
public class BrandFactoryTest {

    @Test
    public void testCreateBrand() {
        // Test valid brand creation
        int brandId = 1;
        String brandName = "TestBrand";
        String color = "TestColor";

        Brand brand = BrandFactory.createBrand(brandId, brandName, color);

        assertNotNull(brand);
        assertEquals(brandId, brand.getBrandId());
        assertEquals(brandName, brand.getBrandName());
        assertEquals(color, brand.getColor());

        // Test invalid brand creation with null parameters
        Brand invalidBrand = BrandFactory.createBrand(0, null, null);
        assertNull(invalidBrand);
    }
}
