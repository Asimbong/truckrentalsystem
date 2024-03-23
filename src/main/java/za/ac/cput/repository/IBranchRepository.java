package za.ac.cput.repository;

import za.ac.cput.domain.Branch;
import java.util.List;
/**
 *IBranchRepository.java
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 22 March 2024
 */
public interface IBranchRepository extends IRepository<Branch, String> {
    List<Branch> getAll();
}
