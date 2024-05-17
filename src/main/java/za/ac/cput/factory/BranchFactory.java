package za.ac.cput.factory;

import za.ac.cput.domain.Branch;
import za.ac.cput.util.Helper;

/**
 * BranchFactory.java
 * This is the Factory class
 * @author Thandolwethu Zamasiba Khoza (221797289)
 * Date: 16 May 2024
 */
public class BranchFactory {
    public static Branch buildBranch(int branchId, String address, String city, String province, String country) {
        if (Helper.isIntNotValid(branchId) || !Helper.isValidAddress(address) || !Helper.isValidAddress(city) ||
                !Helper.isValidAddress(country)) {
            return null;
        }

        return new Branch.Builder().setBranchId(branchId)
                .setAddress(address)
                .setCity(city)
                .setProvince(province)
                .setCountry(country)
                .build();

    }
}
