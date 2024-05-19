package za.ac.cput.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Manager;
import za.ac.cput.domain.Truck;
import za.ac.cput.repository.ManagerRepository;
import java.util.Set;
import java.util.stream.Collectors;
/**
 *Truck.java
 * Ayanda Phumzile Khoza (218057172)
 * Date: 18 May 2024
 * */

@Service
public abstract class ManagerService implements IManagerService {
    private final ManagerRepository managerRepository;
    private ManagerRepository ManagerRepository;

    @Autowired
    ManagerService(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    @Override
    public Manager create(Manager manager) {
        Truck employee = null;
        return managerRepository.save(employee);
    }

    
    @Override
    public Manager read(String firstName) {
        return  this.managerRepository.findById(Integer.valueOf(firstName)).orElse(null);
    }

    @Override
    public Manager update(Manager manager) {
        Truck employee = null;
        return managerRepository.save(employee);
    }

    @Override
    public void delete(Integer firstName) {
        managerRepository.deleteById(firstName);
    }

    @Override
    public Set<Manager> getAll() {
        return managerRepository.findAll().stream().collect(Collectors.toSet());
    }
}
