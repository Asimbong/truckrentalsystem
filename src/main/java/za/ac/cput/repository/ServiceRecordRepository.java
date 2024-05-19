package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.ServiceRecord;

/**
 * @aurthor Malesela Modiba (222140275)
 * Date: 04 May 2024
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Repository
public  interface ServiceRecordRepository extends JpaRepository<ServiceRecord, Integer> {


}

