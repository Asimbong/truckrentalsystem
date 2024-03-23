package za.ac.cput.repository;

import za.ac.cput.domain.RentCar;

import java.util.List;
/**
 * IRentCarRepository.java
 * This is the repository interface
 * @aurthor Zukhanye Anele Mene (221090754)
 * Date: 23 March 2024
 */
public interface IRentCarRepository extends IRepository<RentCar,String> {
    List<RentCar>getAll();
}

