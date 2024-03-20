
package za.ac.cput.factory;

import za.ac.cput.domain.Branch;
import za.ac.cput.util.Helper;
/**
 *BranchFactory.java
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 20 March 2024
 */
public class BranchFactory {
    public static Branch createBranch(String branchName, String location, String managerName, int contactNumber) {
        if (Helper.isNullOrEmpty(branchName) || Helper.isNullOrEmpty(location) || Helper.isNullOrEmpty(managerName)) {
            return null;
        }

       
        return new Branch.Builder()
                .setBranchName(branchName)
                .setLocation(location)
                .setManagerName(managerName)
                .setContactNumber(contactNumber)
                .build();
    }
}
