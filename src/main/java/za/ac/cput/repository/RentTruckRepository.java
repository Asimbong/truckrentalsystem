package za.ac.cput.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.RentTruck;


public interface RentTruckRepository  extends JpaRepository<RentTruck,String> {
}
