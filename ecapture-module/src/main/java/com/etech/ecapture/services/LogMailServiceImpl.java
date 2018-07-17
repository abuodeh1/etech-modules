package com.etech.ecapture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etech.ecapture.entities.LogMail;
import com.etech.ecapture.repositories.LogMailRepo;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 3:07:27 PM
 */

@Service
public class LogMailServiceImpl implements ServiceDAO<LogMail, Integer>{

	@Autowired
	private LogMailRepo logMailRepo;

	@Override
	public LogMail get(Integer entityID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LogMail> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(LogMail entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(List<LogMail> entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(LogMail entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(List<LogMail> entity) {
		// TODO Auto-generated method stub
		
	}

}