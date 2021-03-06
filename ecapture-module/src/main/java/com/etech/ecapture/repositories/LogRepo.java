package com.etech.ecapture.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etech.ecapture.entities.Log;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 9:51:10 AM
 */
@Repository
public interface LogRepo extends JpaRepository<Log, Integer> {

}