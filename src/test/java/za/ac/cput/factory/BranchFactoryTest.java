package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Branch;

import static org.junit.jupiter.api.Assertions.*;

/**
 * BranchFactoryTest.java
 * This is the FactoryTest class
 * @author Thandolwethu Zamasiba Khoza (221797289)
 * Date: 16 May 2024
 */

class BranchFactoryTest {
    private Branch branch1;
    private Branch branch2;
    private Branch branch3;

    @BeforeEach
    void setUp() {
        branch1 = new BranchFactory().buildBranch(7834, "10 Dorset St"
                , "Woodstock", "Cape Town", "South Africa");

        branch2 = new BranchFactory().buildBranch(7674, "11 Darling St",
                "City Centre", "Cape Town", "South Africa");

        branch3 = branch1;

    }

    @Test
    void buildBranch() {
        assertNotNull(branch1);
        System.out.println(branch1);

        assertNotNull(branch2);
        System.out.println(branch2);
    }
    @Test
    void buildBranchIdentity() {
        assertSame(branch1, branch3);
    }
}