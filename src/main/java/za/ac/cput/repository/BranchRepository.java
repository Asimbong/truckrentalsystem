package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Branch;

/**
 * Branch Repository.java
 * This is the iRepository class
 * @author Thandolwethu Zamasiba Khoza (221797289)
 * Date: 16 May 2024
 */

public interface BranchRepository extends JpaRepository<Branch, Integer> {
}
