package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Insurance;
import za.ac.cput.repository.InsuranceRepository;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class InsuranceService implements IInsuranceService {
    private InsuranceRepository insuranceRepository;

    @Autowired
    InsuranceService(InsuranceRepository insuranceRepository) {
        this.insuranceRepository = insuranceRepository;
    }

    @Override
    public Insurance create(Insurance insurance) {
        return insuranceRepository.save(insurance);
    }

    @Override
    public Insurance read(Integer insuranceID) {
        return this.insuranceRepository.findById(insuranceID).orElse(null);
    }

    @Override
    public Insurance update(Insurance insurance) {
        return insuranceRepository.save(insurance);
    }

    @Override
    public void delete(Integer insuranceID) {
        insuranceRepository.deleteById(insuranceID);
    }

    @Override
    public Set<Insurance> getAll() {
        return insuranceRepository.findAll().stream().collect(Collectors.toSet());
    }
}
