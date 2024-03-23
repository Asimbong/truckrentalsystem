package za.ac.cput.repository;

import za.ac.cput.domain.LoginDetails;

import java.util.List;
/**
 * ILoginDetailsRepository.java
 * This is the repository interface
 * @aurthor Zukhanye Anele Mene (219404275)
 * Date: 23 March 2024
 */
public interface ILoginDetailsRepository extends IRepository<LoginDetails,String> {
    List<LoginDetails>getAll();
}

