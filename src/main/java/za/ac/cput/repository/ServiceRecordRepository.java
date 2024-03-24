package za.ac.cput.repository;

import za.ac.cput.domain.ServiceRecord;

/**
 * PaymentRepository.java
 * This is the repository program
 * @aurthor Malesela Modiba (222140275)
 * Date: 23 March 2024
 */
import java.util.ArrayList;
import java.util.List;
public  class ServiceRecordRepository implements IServiceRecordRepository {
    private static IServiceRecordRepository serviceRecordRepository = null;

    private List<ServiceRecord> serviceRecordList;

    private ServiceRecordRepository() {
        serviceRecordList = new ArrayList<>();
    }

    public static IServiceRecordRepository getServiceRecordRepository() {
        if (serviceRecordRepository == null) {
            serviceRecordRepository = new ServiceRecordRepository();
        }
        return serviceRecordRepository;
    }

    @Override
    public List<ServiceRecord> getAll() {
        return serviceRecordList;
    }

    @Override
    public ServiceRecord create(ServiceRecord serviceRecord) {
        boolean success = serviceRecordList.add(serviceRecord);
        if (success)
            return serviceRecord;
        return null;
    }

    @Override
    public ServiceRecord read(String s) {
        return null;
    }

    public ServiceRecord read(int PaymentID) {
        for (ServiceRecord serviceRecord : serviceRecordList) {
            if (serviceRecord.getVehicleID() == PaymentID)
                return serviceRecord;
        }
        return null;
    }

    @Override
    public ServiceRecord update(ServiceRecord serviceRecord) {
        String serviceDate = serviceRecord.getServiceDate();
        if (delete(serviceDate)) {
            if (serviceRecordList.add(serviceRecord))
                return serviceRecord;
            else
                return null;
        }
        return null;
    }
    @Override
    public boolean delete(String id) {
        ServiceRecord serviceRecordToDelete = read(id);
        if (serviceRecordToDelete == null)
            return false;
        return serviceRecordList.remove(serviceRecordToDelete);
    }
}

