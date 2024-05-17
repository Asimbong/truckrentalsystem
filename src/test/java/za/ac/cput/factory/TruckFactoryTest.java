
package za.ac.cput.factory;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Truck;
import static org.junit.jupiter.api.Assertions.*;

/**
 *Truck.java
 * This is Truck Domain program
 * @aurthor Ayanda Phumzile Khoza (218057172)
 * Date: 07 May 2024
 * */


class TruckFactoryTest {
    @Test
    void createTruck() {
        Truck createTruck = TruckFactory.buildTruck("Serial", "Scania", "2022", "Diecast", "wer", 16.50,2.55,1.1,30);
        assertNull(createTruck);
        System.out.println("Created: " + createTruck);
    }
}


