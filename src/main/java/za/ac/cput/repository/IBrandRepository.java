package za.ac.cput.repository;

import za.ac.cput.domain.Brand;
import java.util.List;
/**
 *IBrandRepository.java
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 22 March 2024
 */
public interface IBrandRepository extends IRepository<Brand, Integer> {
    List<Brand> getAll();
}
