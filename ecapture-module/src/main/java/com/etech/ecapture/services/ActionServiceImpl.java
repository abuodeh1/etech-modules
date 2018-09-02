package com.etech.ecapture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etech.ecapture.entities.Action;
import com.etech.ecapture.repositories.ActionRepo;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 3:07:25 PM
 */

@Service
public class ActionServiceImpl{


	@Autowired
	private ActionRepo actionRepo;

	public List<Action> findByActionName(String token) {
		
		return actionRepo.findByActionName(token);
	}
	
	
	public List<Action> findAll() {
		
		return actionRepo.findAll();
	}

}