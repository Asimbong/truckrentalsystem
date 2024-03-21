package za.ac.cput.factory;

import za.ac.cput.domain.ServiceRecord;
import za.ac.cput.util.Helper;

public class ServiceRecordFactory {
    public static ServiceRecord buildServiceRecord(int vehicleID, String serviceDate, String serviceType, String description, int cost, String mechanic, String nextServiceDate) {
        if (Helper.isNullOrEmpty(String.valueOf(vehicleID)) || Helper.isNullOrEmpty(serviceDate) || Helper.isNullOrEmpty(serviceType)
                || Helper.isNullOrEmpty(description)
                || Helper.isNullOrEmpty(String.valueOf(cost)) || Helper.isNullOrEmpty(mechanic)
                || Helper.isNullOrEmpty(nextServiceDate))
            return null;

        return new ServiceRecord.Builder().setVehicleID(vehicleID).setServiceDate(serviceDate)
                .setServiceType(serviceType).setDescription(description).setCost(cost)
                .setMechanic(mechanic).setNextServiceDate(nextServiceDate).build();
    }
        public static ServiceRecord buildServiceRecord(String serviceDate, String serviceType, int cost) {
            if (Helper.isNullOrEmpty(serviceDate) || Helper.isNullOrEmpty(serviceType) || Helper.isNullOrEmpty(String.valueOf(cost)))
                return null;
            int vehicleID = Integer.parseInt(Helper.generateId());
            return new ServiceRecord.Builder().setVehicleID(vehicleID)
                    .setServiceDate(serviceDate).setServiceType(serviceType).setCost(cost)
                    .build();
        }
    }

