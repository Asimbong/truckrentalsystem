package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.SalesPerson;
import za.ac.cput.repository.SalesPersonRepository;

import java.util.Set;
import java.util.stream.Collectors;
@Service
public  class SalesPersonService implements ISalesPersonService{
    private SalesPersonRepository salesPersonRepository;

    @Autowired
    SalesPersonService(SalesPersonRepository salesPersonRepository){
        this.salesPersonRepository = salesPersonRepository;
    }
    @Override
    public SalesPerson create (SalesPerson salesPerson){
        return salesPersonRepository.save(salesPerson);
    }
    @Override
    public SalesPerson read(String EmployeeNumber){
        return this.salesPersonRepository.findById(EmployeeNumber).orElse(null);

    }
    @Override
    public SalesPerson update(SalesPerson salesPerson){
        return salesPersonRepository.save(salesPerson);
    }
    @Override
    public void delete(String EmplyoeeNumber){
        salesPersonRepository.deleteById(EmplyoeeNumber);
    }
    @Override
    public Set<SalesPerson> getAll(){
        return salesPersonRepository.findAll().stream().collect(Collectors.toSet());
    }
}
