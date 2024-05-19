package za.ac.cput.service;
import za.ac.cput.domain.Manager;

import java.util.Set;
/**
 *Truck.java
 * Ayanda Phumzile Khoza (218057172)
 * Date: 18 May 2024
 * */

public interface IManagerService extends IService<Manager,Integer>{
    Manager read(String firstName);

    Manager update(Manager manager);

    void delete(Integer firstName);

    Set<Manager> getAll();
}
