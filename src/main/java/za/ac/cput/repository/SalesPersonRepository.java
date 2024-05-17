package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import za.ac.cput.domain.SalesPerson;

public interface SalesPersonRepository extends JpaRepository<SalesPerson,String> {
}
