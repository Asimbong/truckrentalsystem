package za.ac.cput.service;

import za.ac.cput.domain.Insurance;

import java.util.Set;

public interface IInsuranceService extends IService<Insurance,Integer>{
    Insurance update(Insurance insurance);
    Set<Insurance> getAll();
}
