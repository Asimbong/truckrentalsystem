package za.ac.cput.repository;

import za.ac.cput.domain.ReturnCar;
import java.util.List;

/**
 * IReturnCarRepository.java
 * This is the repository interface
 * @author Thandolwethu Khoza (221797289)
 * Date: 24 March 2024
 */

public interface IReturnCarRepository extends IRepository<ReturnCar,String> {
    List<ReturnCar> getAll();

}
