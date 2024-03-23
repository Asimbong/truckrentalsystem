package za.ac.cput.repository;

import za.ac.cput.domain.RentCar;

import java.util.ArrayList;
import java.util.List;
/**
 * RentCarRepository.java
 * This is the repository program
 * @aurthor Zukhanye Anele Mene (219404275)
 * Date: 23 March 2024
 */
public class RentCarRepository implements IRentCarRepository {

    private static IRentCarRepository rentCarRepository  = null;

    private List<RentCar> rentedCarList;

    private RentCarRepository() {

        rentedCarList = new ArrayList<RentCar>();
    }

    public static IRentCarRepository getRentCarRepository() {
        if (rentCarRepository == null) {
            rentCarRepository = new RentCarRepository();
        }
        return rentCarRepository;
    }

    @Override
    public List<RentCar> getAll() {
        return rentedCarList;
    }

    @Override
    public RentCar create(RentCar rentedCar) {
        boolean success = rentedCarList.add(rentedCar);
        if (success)
            return rentedCar;
        return null;
    }

    @Override
    public RentCar read(String id) {

        int rentalID = Integer.parseInt(id);
        for (RentCar rentedCar : rentedCarList) {
             if (rentedCar.getRentalID() == rentalID )
                return rentedCar;
        }
        return null;
    }

    @Override
    public RentCar update(RentCar rentedCar) {
         int rentalID = rentedCar.getRentalID();
        if (delete(String.valueOf(rentalID))) {
            if (rentedCarList.add(rentedCar))
                return rentedCar;
            else
                return null;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        RentCar rentalToDelete = read(id);
        if (rentalToDelete == null)
            return false;
        return (rentedCarList.remove(rentalToDelete));
    }
}


