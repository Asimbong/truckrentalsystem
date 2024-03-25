package za.ac.cput.repository;
import za.ac.cput.domain.Car;
import java.util.List;


/*Author:Ayanda Phumzile Khoza
  Student number:218057172
 Date:18 March 2024*/

public interface ICarRepository extends IRepository<Car,String> {
    List<Car> getAll();

}