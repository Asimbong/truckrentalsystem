package za.ac.cput.service;

import za.ac.cput.domain.SalesPerson;

import java.util.Set;
/*  Completed By Malesela Modiba
    19 May 2024
 */
public interface ISalesPersonService extends IService<SalesPerson,String>{
    SalesPerson update(SalesPerson salesPerson);
    Set<SalesPerson> getAll();
}
