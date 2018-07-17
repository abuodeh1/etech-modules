package com.etech.ecapture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etech.ecapture.entities.LogComponent;
import com.etech.ecapture.repositories.LogComponentRepo;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 3:07:27 PM
 */

@Service
public class LogComponentServiceImpl implements ServiceDAO<LogComponent, Integer>{ 

	@Autowired
	private LogComponentRepo logComponentRepo;

	@Override
	public LogComponent get(Integer entityID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LogComponent> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(LogComponent entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(List<LogComponent> entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(LogComponent entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(List<LogComponent> entity) {
		// TODO Auto-generated method stub
		
	}

}