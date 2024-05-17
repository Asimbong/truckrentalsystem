package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Mechanic;

import static org.junit.jupiter.api.Assertions.assertNotNull;


import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.assertNotNull;
/**
 * CustomerFactoryTest.java
 * This is the factory test class
 * @aurthor Zukhanye Anele Mene (219404275)
 * Date: 16 May 2024
 **/
  class MechanicFactoryTest {

     @Test
      void buildMechanic() {
          Mechanic mechanic = MechanicFactory.buildMechanic(1, "Engine", true,
                  "011", "Zukhanye"  , "Mene", "bennie@gmail.com", "Mechanic");
          assertNotNull(mechanic);
          System.out.println(mechanic.toString());
      }

     @Test
     void buildMechanicWithFail() {
         Mechanic mechanic = MechanicFactory.buildMechanic(-1, "", false,
                 null, "", "", "benn7eGmh.co.za", "");
         assertNotNull(mechanic);
         System.out.println(mechanic.toString());
    }
}



