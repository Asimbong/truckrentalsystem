package za.ac.cput.repository;

import za.ac.cput.domain.ReturnTruck;

import java.util.ArrayList;
import java.util.List;

/**
 * ReturnTruckRepository.java
 * This is the repository program
 * @author Thandolwethu Khoza (221797289)
 * Date: 24 March 2024
 */

public class ReturnTruckRepository implements IReturnTruckRepository {
    private static IReturnTruckRepository returnTruckRepository = null;

    private List<ReturnTruck> returnTruckList;

    public ReturnTruckRepository() {
        returnTruckList = new ArrayList<ReturnTruck>();
    }

    public static IReturnTruckRepository getReturnTruckRepository() {
        if (returnTruckRepository == null) {
            returnTruckRepository = new ReturnTruckRepository();
        }
        return returnTruckRepository;
    }

    @Override
    public List<ReturnTruck> getAll() {
        return returnTruckList;
    }

    @Override
    public ReturnTruck create(ReturnTruck returnTruck) {
        boolean success = returnTruckList.add(returnTruck);
        if (success)
            return returnTruck;
        return null;
    }

    @Override
    public ReturnTruck read(String s) {
        return null;
    }

    public ReturnTruck read(int id) {
        for (ReturnTruck returnTruck : returnTruckList) {
            if (returnTruck.getReturnID() == (id))
                return returnTruck;
        }
        return null;
    }
    @Override
    public ReturnTruck update(ReturnTruck returnTruck) {
        String returnCarID = String.valueOf(returnTruck.getReturnID());
        if(delete(returnCarID)) {
            if (returnTruckList.add(returnTruck))
                return returnTruck;
            else
                return null;
        }
        return null;
    }
    @Override
    public boolean delete(String id) {
        ReturnTruck returnTruckToDelete = read(id);
        if (returnTruckToDelete == null)
            return false;
        return (returnTruckList.remove(returnTruckToDelete));
    }

}
