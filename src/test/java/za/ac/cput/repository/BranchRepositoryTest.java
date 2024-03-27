package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Branch;

import static org.junit.jupiter.api.Assertions.*;
/**
 *BranchRepositoryTest.java
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 26 March 2024
 */
class BranchRepositoryTest {

    private BranchRepository branchRepository;
    private Branch branch;

    @BeforeEach
    void setUp() {
        branchRepository = BranchRepository.getBranchRepository();
        branch = new Branch.Builder()
                .setBranchName("TestBranch")
                .setLocation("123 Main Street")
                .setManagerName("John Doe")
                .setContactNumber(123456789)
                .build();
    }

    @Test
    void testCreateBranch() {
        Branch createdBranch = branchRepository.create(branch);
        assertNotNull(createdBranch);
        assertEquals(branch, createdBranch);
    }

    @Test
    void testReadBranch() {
        branchRepository.create(branch);
        Branch readBranch = branchRepository.read(branch.getBranchName());
        assertNotNull(readBranch);
        assertEquals(branch, readBranch);
    }

    @Test
    void testUpdateBranch() {
        branchRepository.create(branch);
        Branch updatedBranch = new Branch.Builder()
                .copy(branch)
                .setManagerName("Updated Manager")
                .build();
        branchRepository.update(updatedBranch);
        Branch retrievedBranch = branchRepository.read(branch.getBranchName());
        assertEquals(updatedBranch, retrievedBranch);
    }

    @Test
    void testDeleteBranch() {
        branchRepository.create(branch);
        boolean deleteResult = branchRepository.delete(branch.getBranchName());
        assertTrue(deleteResult);
        assertNull(branchRepository.read(branch.getBranchName()));
    }

    @Test
    void testGetAllBranches() {
        branchRepository.create(branch);
        assertEquals(1, branchRepository.getAll().size());
    }
}
