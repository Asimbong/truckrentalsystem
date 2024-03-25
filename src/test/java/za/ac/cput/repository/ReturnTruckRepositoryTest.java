package za.ac.cput.repository;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.ReturnTruck;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ReturnTruckRepositoryTest.java
 * This is the repository test class
 * @author Thandolwethu Khoza (221797289)
 * Date: 24 March 2024
 */
public class ReturnTruckRepositoryTest {
    private ReturnCarRepository returnCarRepository;

    @BeforeEach
    void setUp() {
        returnCarRepository = (ReturnCarRepository) ReturnCarRepository.getReturnCarRepository();
        returnCarRepository.create(new ReturnTruck.Builder()
                .setReturnID("1")
                .setRentalID(1001)
                .setOverdueAmount(50.0)
                .setDateReturn(LocalDate.of(2024, 3, 24))
                .setTimeReturn(LocalTime.of(12, 30))
                .build());
        returnCarRepository.create(new ReturnTruck.Builder()
                .setReturnID("2")
                .setRentalID(1002)
                .setOverdueAmount(75.0)
                .setDateReturn(LocalDate.of(2024, 3, 25))
                .setTimeReturn(LocalTime.of(14, 15))
                .build());

    }
    @Test
    void getAll() {
        System.out.println(returnCarRepository.getAll() + "\n");
        System.out.println(returnCarRepository);
    }

    @Test
    void create() {
        ReturnTruck newReturnTruck = new ReturnTruck.Builder()
                .setReturnID("3")
                .setRentalID(1003)
                .setOverdueAmount(60.0)
                .setDateReturn(LocalDate.of(2024, 3, 26))
                .setTimeReturn(LocalTime.of(10, 45))
                .build();
        ReturnTruck createdReturnTruck = returnCarRepository.create(newReturnTruck);
        assertEquals(newReturnTruck, createdReturnTruck);

        System.out.println(newReturnTruck);

}

//    @Test
//    void update() {
//
//    }

//    @Test
//    void delete() {
//
//    }

}

