package za.ac.cput.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Manager;
import za.ac.cput.domain.Truck;

/**
 *Truck.java
 * This is Truck Domain program
 * Ayanda Phumzile Khoza (218057172)
 * Date: 07 May 2024
 * */
@Repository
public  interface ManagerRepository extends JpaRepository<Manager, String> {
}



