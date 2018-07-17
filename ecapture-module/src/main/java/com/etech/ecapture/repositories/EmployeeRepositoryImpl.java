package com.etech.ecapture.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.etech.ecapture.entities.Employee;

/**
 * Created by gkatzioura on 6/3/16.
 */
@Repository
@Transactional(readOnly = true)
public class EmployeeRepositoryImpl implements EmployeeRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

//    @Override
//    public List<Employee> getFirstNamesLikeAndBonusBigger(String firstName, Double bonusAmount) {
//        Query query = entityManager.createNativeQuery("select e.* from moh.employee e\n" +
//                "where e.firstname LIKE ? ", Employee.class);
//        query.setParameter(1, firstName + "%");
//
//        return query.getResultList();
//    }

    @Override
    public List<Employee> getXYZ(String firstName, Double bonusAmount) {
        Query query = entityManager.createNativeQuery("select e.* from moh.employee e\n" +
                "where e.firstname LIKE ? ", Employee.class);
        query.setParameter(1, firstName + "%");

        return query.getResultList();
    }
}
