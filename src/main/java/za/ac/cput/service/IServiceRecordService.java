package za.ac.cput.service;

import za.ac.cput.domain.ServiceRecord;

import java.util.Set;
/*  Completed By Malesela Modiba
    19 May 2024
 */
public interface IServiceRecordService extends IService<ServiceRecord,Integer> {
    ServiceRecord update(ServiceRecord serviceRecord);
    Set<ServiceRecord> getAll();
}
