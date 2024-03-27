package za.ac.cput.factory;

import za.ac.cput.domain.Protection;
import za.ac.cput.util.Helper;
/*Author:Ayanda Phumzile Khoza
  Student number:218057172
 Date:18 March 2024*/

public class ProtectionFactory {

    public static Protection createProtection(  String truckId, String policyType, String startDate, String endDate){
        String insuranceId = Helper.generateId();

        return new Protection.Builder()
                .setInsuranceId(insuranceId)
                .setTruckId(truckId)
                .setPolicyType(policyType)
                .setStartDate(startDate)
                .setEndDate(endDate)
                .build();
    }
}


