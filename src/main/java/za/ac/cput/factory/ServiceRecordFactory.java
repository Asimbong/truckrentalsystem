package za.ac.cput.factory;


import za.ac.cput.domain.ServiceRecord;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

/**
 * @aurthor Malesela Modiba (222140275)
 * Date: 04 May 2024
 */
public class ServiceRecordFactory {
    public static ServiceRecord buildServiceRecord (int serviceID, LocalDate serviceDate, String serviceType,
                                            String Description, double cost,
                                            String mechanic, LocalDate nextServiceDate, String vin) {

        if ((serviceID <= 0) ||
                Helper.isNullOrEmpty(String.valueOf(serviceDate))
                || Helper.isNullOrEmpty(serviceType)
                || Helper.isNullOrEmpty(Description)
                || !Helper.isNullOrEmpty((mechanic))
                || Helper.isNullOrEmpty(String.valueOf(nextServiceDate))
                || (cost <= 0)||Helper.isNullOrEmpty(vin))

            return null;

        return new ServiceRecord.Builder().setServiceID(serviceID)
                .setServiceDate(serviceDate)
                .setServiceType(serviceType)
                .setDescription(Description)
                .setCost(cost)
                .setMechanic(mechanic)
                .setNextServiceDate(nextServiceDate)
                .setVin(vin)
                .build();
    }
    }

