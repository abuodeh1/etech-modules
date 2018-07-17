package com.etech.ecapture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etech.ecapture.entities.Log;
import com.etech.ecapture.repositories.LogRepo;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 3:07:27 PM
 */

@Service
public class LogServiceImpl implements ServiceDAO<Log, Integer>{ 

	@Autowired
	private LogRepo logRepo;

	@Override
	public Log get(Integer entityID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Log> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Log entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(List<Log> entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Log entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(List<Log> entity) {
		// TODO Auto-generated method stub
		
	}

}