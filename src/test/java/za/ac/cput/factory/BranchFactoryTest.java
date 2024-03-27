package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Branch;
/**
 *BranchFactoryTest.java
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 25 March 2024
 */
import static org.junit.jupiter.api.Assertions.*;

public class BranchFactoryTest {

    @Test
    public void testCreateBranch() {
        // Test valid branch creation
        String branchName = "Main Branch";
        String location = "123 Main Street";
        String managerName = "John Doe";
        int contactNumber = 123456789;

        Branch branch = BranchFactory.createBranch(branchName, location, managerName, contactNumber);

        assertNotNull(branch);
        assertEquals(branchName, branch.getBranchName());
        assertEquals(location, branch.getLocation());
        assertEquals(managerName, branch.getManagerName());
        assertEquals(contactNumber, branch.getContactNumber());

        // Test invalid branch creation with null parameters
        Branch invalidBranch = BranchFactory.createBranch(null, null, null, 0);
        assertNull(invalidBranch);
    }
}
