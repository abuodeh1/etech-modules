package com.etech.ecapture.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etech.ecapture.entities.Employee;

/**
 * Created by gkatzioura on 6/2/16.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>, EmployeeRepositoryCustom {

    //List<Employee> fetchByLastNameLength(@Param("length") Long length);
}
