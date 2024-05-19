package za.ac.cput.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Truck;
import za.ac.cput.repository.TruckRepository;
import java.util.Set;
import java.util.stream.Collectors;
/**
 *Truck.java
 * This is Truck Domain program
 * Ayanda Phumzile Khoza (218057172)
 * Date: 18 May 2024
        * */

@Service
public class TruckService implements ITruckService {
    private final za.ac.cput.repository.TruckRepository truckRepository;
    private TruckRepository TruckRepository;

    @Autowired
    TruckService(TruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }

    @Override
    public Truck create(Truck truck) {
        return truckRepository.save(truck);
    }

    @Override
    public Truck read(double truckID) {
        return this.truckRepository.findById((int) truckID).orElse(null);
    }

    @Override
    public Truck update(Truck truck) {
        return truckRepository.save(truck);
    }

    @Override
    public void delete(double truckID) {
        truckRepository.deleteById((int) truckID);
    }

    @Override
    public Set<Truck> getAll() {
        return truckRepository.findAll().stream().collect(Collectors.toSet());
    }
}
