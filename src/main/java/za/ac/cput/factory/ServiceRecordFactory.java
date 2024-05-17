package za.ac.cput.factory;


import za.ac.cput.domain.ServiceRecord;
import za.ac.cput.util.Helper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @aurthor Malesela Modiba (222140275)
 * Date:17 May 2024
 */
public class ServiceRecordFactory {
    public static ServiceRecord buildServiceRecord (int serviceID, LocalDate serviceDate, String serviceType,
                                            String Description, double cost,
                                            String mechanic, LocalDate nextServiceDate, String vin) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Helper.DateValidatorUsingLocalDate dateValidator = new Helper.DateValidatorUsingLocalDate(dateFormatter);

        if (Helper.isIntNotValid(serviceID) ||
                serviceDate == null || !dateValidator.isValid(serviceDate.toString())
                || Helper.isNullOrEmpty(serviceType)
                || Helper.isNullOrEmpty(Description)
                || Helper.isNullOrEmpty((mechanic))
                || nextServiceDate == null
                || !dateValidator.isValid(nextServiceDate.toString())
                || Helper.isDoubleNotNull(cost )
                || Helper.isNullOrEmpty(vin))
        {

            return null;
}

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


