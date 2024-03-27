package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Brand;

import static org.junit.jupiter.api.Assertions.*;
/**
 *BrandRepositoryTest.java
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 26 March 2024
 */
class BrandRepositoryTest {

    private BrandRepository brandRepository;
    private Brand brand;

    @BeforeEach //ensures that the repository and brand objects are initialized before each test method runs.
    void setUp() {
        brandRepository = BrandRepository.getBrandRepository();
        brand = new Brand.Builder()
                .setBrandId(1)
                .setBrandName("TestBrand")
                .setColor("TestColor")
                .build();
    }

    @Test
    void testCreateBrand() {
        Brand createdBrand = brandRepository.create(brand);
        assertNotNull(createdBrand);
        assertEquals(brand, createdBrand);
    }

    @Test
    void testReadBrand() {
        brandRepository.create(brand);
        Brand readBrand = brandRepository.read(brand.getBrandId());
        assertNotNull(readBrand);
        assertEquals(brand, readBrand);
    }

    @Test
    void testUpdateBrand() {
        brandRepository.create(brand);
        Brand updatedBrand = new Brand.Builder()
                .copy(brand)
                .setColor("UpdatedColor")
                .build();
        brandRepository.update(updatedBrand);
        Brand retrievedBrand = brandRepository.read(brand.getBrandId());
        assertEquals(updatedBrand, retrievedBrand);
    }

    @Test
    void testDeleteBrand() {
        brandRepository.create(brand);
        boolean deleteResult = brandRepository.delete(brand.getBrandId());
        assertTrue(deleteResult);
        assertNull(brandRepository.read(brand.getBrandId()));
    }

    @Test
    void testGetAllBrands() {
        brandRepository.create(brand);
        assertEquals(1, brandRepository.getAll().size());
    }
}
