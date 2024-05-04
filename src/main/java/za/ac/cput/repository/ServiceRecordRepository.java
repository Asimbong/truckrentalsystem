package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.ServiceRecord;

/**
 * @aurthor Malesela Modiba (222140275)
 * Date: 23 March 2024
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public  interface ServiceRecordRepository extends JpaRepository<ServiceRecord, Integer> {


}

