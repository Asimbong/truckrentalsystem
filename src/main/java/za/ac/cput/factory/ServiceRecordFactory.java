package za.ac.cput.factory;

import za.ac.cput.domain.ServiceRecord;
import za.ac.cput.util.Helper;

public class ServiceRecordFactory {
    public static ServiceRecord buildDriver(int VehicleID, String ServiceDate, String ServiceType, String Description, int Cost, String Mechanic, String NextServiceDate) {
        if (Helper.isNullOrEmpty(String.valueOf(VehicleID)) || Helper.isNullOrEmpty(ServiceDate) || Helper.isNullOrEmpty(ServiceType)
                || Helper.isNullOrEmpty(Description)
                || Helper.isNullOrEmpty(String.valueOf(Cost)) || Helper.isNullOrEmpty(Mechanic)
                || Helper.isNullOrEmpty(NextServiceDate))
            return null;

        return new ServiceRecord.Builder().setVehicleID(VehicleID).setServiceDate(ServiceDate)
                .setServiceType(ServiceType).setDescription(Description).setCost(Cost)
                .setMechanic(Mechanic).setService(NextServiceDate).build();
    }
        public static ServiceRecord buildDriver(String ServiceDate, String ServiceType, int Cost) {
            if (Helper.isNullOrEmpty(ServiceDate) || Helper.isNullOrEmpty(ServiceType) || Helper.isNullOrEmpty(String.valueOf(Cost)))
                return null;
            int VehicleID = Integer.parseInt(Helper.generateId());
            return new ServiceRecord.Builder().setVehicleID(VehicleID)
                    .setServiceDate(ServiceDate).setServiceType(ServiceType).setCost(Cost)
                    .build();
        }
    }

