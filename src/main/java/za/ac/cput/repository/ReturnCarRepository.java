package za.ac.cput.repository;

import za.ac.cput.domain.ReturnCar;

import java.util.ArrayList;
import java.util.List;

/**
 * ReturnCarRepository.java
 * This is the repository program
 * @author Thandolwethu Khoza (221797289)
 * Date: 24 March 2024
 */

public class ReturnCarRepository implements IReturnCarRepository{
    private static IReturnCarRepository returnCarRepository = null;

    private List<ReturnCar> returnCarList;

    private ReturnCarRepository() {
        returnCarList = new ArrayList<ReturnCar>();
    }

    public static IReturnCarRepository getReturnCarRepository() {
        if (returnCarRepository == null) {
            returnCarRepository = new ReturnCarRepository();
        }
        return returnCarRepository;
    }

    @Override
    public List<ReturnCar> getAll() {
        return returnCarList;
    }

    @Override
    public ReturnCar create(ReturnCar returnCar) {
        boolean success = returnCarList.add(returnCar);
        if (success)
            return returnCar;
        return null;
    }

    public ReturnCar read(String id) {
        for (ReturnCar returnCar : returnCarList) {
            if (returnCar.getReturnID() == id)
                return returnCar;
        }
        return null;
    }
    @Override
    public ReturnCar update(ReturnCar returnCar) {
        String returnCarID = String.valueOf(returnCar.getReturnID());
        if(delete(returnCarID)) {
            if (returnCarList.add(returnCar))
                return returnCar;
            else
                return null;
        }
        return null;
    }
    @Override
    public boolean delete(String id) {
        ReturnCar returnCarToDelete = read(id);
        if (returnCarToDelete == null)
            return false;
        return (returnCarList.remove(returnCarToDelete));
    }

}
