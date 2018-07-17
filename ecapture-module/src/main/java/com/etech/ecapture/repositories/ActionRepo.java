package com.etech.ecapture.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etech.ecapture.entities.Action;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 9:51:09 AM
 */
@Repository
public interface ActionRepo extends JpaRepository<Action, Integer> {

	
	public List<Action> findByActionName(String token);
}