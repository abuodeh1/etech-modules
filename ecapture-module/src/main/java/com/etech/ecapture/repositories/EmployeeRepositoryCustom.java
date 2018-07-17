package com.etech.ecapture.repositories;

import java.util.List;

import com.etech.ecapture.entities.Employee;

/**
 * Created by gkatzioura on 6/3/16.
 */
public interface EmployeeRepositoryCustom {

//    List<Employee> getFirstNamesLikeAndBonusBigger(String firstName, Double bonusAmount);

	List<Employee> getXYZ(String firstName, Double bonusAmount);

}
