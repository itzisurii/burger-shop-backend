package edu.iCET.repository;

import edu.iCET.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer,String> {
}
