package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Protection;


import static org.junit.jupiter.api.Assertions.*;

class ProtectionFactoryTest {
    @Test
    void createProtection() {
        Protection createProtection = ProtectionFactory.createProtection("Ford", "2017", "2018", "CP56789" );
        assertNotNull(createProtection);
        System.out.println("Created: " + createProtection);
    }
}

