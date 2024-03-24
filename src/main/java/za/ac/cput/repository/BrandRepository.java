package za.ac.cput.repository;

import za.ac.cput.domain.Brand;

import java.util.ArrayList;
import java.util.List;
/**
 *BrandRepository.java
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 22 March 2024
 */
public class BrandRepository implements IBrandRepository {
    private static IBrandRepository brandRepository = null;

    private List<Brand> brandList;

    private BrandRepository() {
        brandList = new ArrayList<>();
    }

    public static IBrandRepository getBrandRepository() {
        if (brandRepository == null) {
            brandRepository = new BrandRepository();
        }
        return brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandList;
    }

    @Override
    public Brand create(Brand brand) {
        boolean success = brandList.add(brand);
        if (success)
            return brand;
        return null;
    }

    @Override
    public Brand read(Integer brandId) {
        for (Brand brand : brandList) {
            if (brand.getBrandId() == brandId)
                return brand;
        }
        return null;
    }


    @Override
    public Brand update(Brand brand) {
        int brandId = brand.getBrandId();
        if (delete(brandId)) {
            if (brandList.add(brand))
                return brand;
            else
                return null;
        }
        return null;
    }

    @Override
    public boolean delete(Integer brandId) {
        Brand brandToDelete = read(brandId);
        if (brandToDelete == null)
            return false;
        return brandList.remove(brandToDelete);
    }


}
