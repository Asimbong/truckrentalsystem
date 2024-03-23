package za.ac.cput.repository;

import za.ac.cput.domain.ServiceRecord;
/**
 * PaymentRepository.java
 * This is the repository program
 * @aurthor Malesela Modiba (222140275)
 * Date: 23 March 2024
 */
import java.util.List;
public interface IServiceRecordRepository extends IRepository<ServiceRecord,String>{
    List<ServiceRecord> getAll();
}
