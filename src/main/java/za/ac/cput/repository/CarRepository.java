package za.ac.cput.repository;

import za.ac.cput.domain.Car;

import java.util.ArrayList;
import java.util.List;

/*Author:Ayanda Phumzile Khoza
  Student number:218057172
 Date:18 March 2024*/

public class CarRepository implements ICarRepository {
    private static ICarRepository carRepository = null;

    private List<Car> carList;

    private CarRepository() {
        carList = new ArrayList<>();
    }

    public static ICarRepository getCarRepository() {
        if (carRepository == null) {
            carRepository = new CarRepository();
        }
        return carRepository;
    }

    @Override
    public List<Car> getAll() {
        return carList;
    }

    @Override
    public Car create(Car car) {
        boolean success = carList.add(car);
        if (success)
            return car;
        return null;
    }

    @Override
    public Car read(String id) {
        for (Car car : carList) {
            if (car.getCarId().equals(id))
                return car;
        }
        return null;
    }

    @Override
    public Car update(Car car) {
        String carName = car.getCarId();
        if (delete(carName)) {
            if (carList.add(car))
                return car;
            else
                return null;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Car carToDelete = read(id);
        if (carToDelete == null)
            return false;
        return carList.remove(carToDelete);
    }
}


