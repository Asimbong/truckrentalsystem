package za.ac.cput.factory;

import za.ac.cput.domain.ServiceRecord;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

/**
 * PaymentRepository.java
 * This is the repository program
 * @aurthor Malesela Modiba (222140275)
 * Date: 23 March 2024
 */
public class ServiceRecordFactory {
    public static ServiceRecord buildServiceRecord(int vehicleID, LocalDate serviceDate, String serviceType, String description, double cost, String mechanic, LocalDate nextServiceDate) {
        if (Helper.isNullOrEmpty(String.valueOf(vehicleID)) || Helper.isNullOrEmpty(String.valueOf(serviceDate)) || Helper.isNullOrEmpty(serviceType)
                || Helper.isNullOrEmpty(description)
                || Helper.isNullOrEmpty(String.valueOf(cost)) || Helper.isNullOrEmpty(mechanic)
                || Helper.isNullOrEmpty(String.valueOf(nextServiceDate)))
            return null;

        return new ServiceRecord.Builder().setVehicleID(vehicleID).setServiceDate(serviceDate)
                .setServiceType(serviceType).setDescription(description).setCost(cost)
                .setMechanic(mechanic).setNextServiceDate(nextServiceDate).build();
    }
        public static ServiceRecord buildServiceRecord(LocalDate serviceDate, String serviceType, double cost) {
            if (Helper.isNullOrEmpty(String.valueOf(serviceDate)) || Helper.isNullOrEmpty(serviceType) || Helper.isNullOrEmpty(String.valueOf(cost)))
                return null;
            int vehicleID = Integer.parseInt(Helper.generateId());
            return new ServiceRecord.Builder().setVehicleID(vehicleID)
                    .setServiceDate((serviceDate)).setServiceType(serviceType).setCost(cost)
                    .build();
        }
    }

