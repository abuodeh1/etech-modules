package com.etech.ecapture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etech.ecapture.entities.Lookup;
import com.etech.ecapture.repositories.LookupRepo;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 3:07:28 PM
 */

@Service
public class LookupServiceImpl implements ServiceDAO<Lookup, Integer>{ 

	@Autowired
	private LookupRepo lookupRepo;

	@Override
	public Lookup get(Integer entityID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lookup> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Lookup entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(List<Lookup> entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Lookup entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(List<Lookup> entity) {
		// TODO Auto-generated method stub
		
	}

}