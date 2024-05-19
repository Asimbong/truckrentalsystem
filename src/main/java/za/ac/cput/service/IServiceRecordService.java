package za.ac.cput.service;

import za.ac.cput.domain.ServiceRecord;

import java.util.Set;

public interface IServiceRecordService extends IService<ServiceRecord,Integer> {
    ServiceRecord update(ServiceRecord serviceRecord);
    Set<ServiceRecord> getAll();
}
