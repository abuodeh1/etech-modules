package com.etech.ecapture.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etech.ecapture.entities.Group;
import com.etech.ecapture.repositories.GroupRepo;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 3:07:27 PM
 */

@Service
public class GroupServiceImpl { 

	@Autowired
	public GroupRepo groupRepo;
	
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Group> findByGroupNameIgnoreLcale(String groupname) {
		
		return groupRepo.findByGroupNameIgnoreLcale(groupname);
	}
	

}