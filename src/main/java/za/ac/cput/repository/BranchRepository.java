package za.ac.cput.repository;

import za.ac.cput.domain.Branch;

import java.util.ArrayList;
import java.util.List;
/**
 *BranchRepository.java
 * @author Siyanda Mthimkhulu (220148279)
 * Date: 22 March 2024
 */

public class BranchRepository implements IBranchRepository {
    private static IBranchRepository branchRepository = null;

    private List<Branch> branchList;

    private BranchRepository() {
        branchList = new ArrayList<>();
    }

    public static IBranchRepository getBranchRepository() {
        if (branchRepository == null) {
            branchRepository = new BranchRepository();
        }
        return branchRepository;
    }

    @Override
    public List<Branch> getAll() {
        return branchList;
    }

    @Override
    public Branch create(Branch branch) {
        boolean success = branchList.add(branch);
        if (success)
            return branch;
        return null;
    }

    @Override
    public Branch read(String id) {
        for (Branch branch : branchList) {
            if (branch.getBranchName().equals(id))
                return branch;
        }
        return null;
    }

    @Override
    public Branch update(Branch branch) {
        String branchName = branch.getBranchName();
        if (delete(branchName)) {
            if (branchList.add(branch))
                return branch;
            else
                return null;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Branch branchToDelete = read(id);
        if (branchToDelete == null)
            return false;
        return branchList.remove(branchToDelete);
    }
}
