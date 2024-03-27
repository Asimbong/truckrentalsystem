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
        brandRepository = (BrandRepository) BrandRepository.getBrandRepository();
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
        Brand updatedBrand = new Brand.Builder().setColor("UpdatedColor")
                .build();
        System.out.println("New Brand:" + updatedBrand);
    }

    @Test
    void testDeleteBrand() {
        brandRepository.create(brand);
        boolean deleteResult = brandRepository.delete(brand.getBrandId());
        assertTrue(deleteResult);
        assertNull(brandRepository.read(brand.getBrandId()));
    }

    @Test
    void e_getAll() {
        System.out.println("------------------------- Display all Trucks ----------------------------------------");
        System.out.println("Display All: ");
        System.out.println(brandRepository.getAll() + "\n");
    }


}
