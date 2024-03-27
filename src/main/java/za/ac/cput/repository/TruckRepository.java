package za.ac.cput.repository;
import za.ac.cput.domain.ServiceRecord;
import za.ac.cput.domain.Truck;
import java.util.ArrayList;
import java.util.List;

/*Author:Ayanda Phumzile Khoza
  Student number:218057172
 Date:18 March 2024*/


public class TruckRepository implements ITruckRepository {
    private static ITruckRepository truckRepository = null;

    private List<Truck> truckList;

    private TruckRepository() {
        truckList = new ArrayList<>();
    }

    public static ITruckRepository getTruckRepository() {
        if (truckRepository == null) {
            truckRepository = new TruckRepository();
        }
        return truckRepository;
    }

    @Override
    public List<Truck> getAll() {
        return truckList;
    }

    @Override
    public Truck create(Truck truck) {
        boolean success = truckList.add(truck);
        if (success)
            return truck;
        return null;
    }

    @Override
    public Truck read(String truckid) {
        for (Truck truck : truckList) {
            if (truck.getTruckId().equals(truckid))
                return truck;
        }
        return null;
    }

    @Override
    public Truck update(Truck truck) {
        String model = truck.getTruckId();
        if (delete(model)) {
            if (delete(model)) {
                if (truckList.add(truck))
                    return truck;
                else
                    return null;
            }
            return null;
        }
        return null;
    }




    @Override
    public boolean delete(String id) {
        Truck truckToDelete = read(id);
        if (truckToDelete == null) {
            return truckList.remove(truckToDelete);
        }
        return false;
    }
}




