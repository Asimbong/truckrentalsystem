package za.ac.cput.service;

import za.ac.cput.domain.SalesPerson;

import java.util.Set;

public interface ISalesPersonService extends IService<SalesPerson,String>{
    SalesPerson update(SalesPerson salesPerson);
    Set<SalesPerson> getAll();
}
