package com.etech.ecapture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etech.ecapture.entities.DataClass;
import com.etech.ecapture.repositories.DataClassRepo;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 3:07:26 PM
 */

@Service
public class DataClassServiceImpl implements ServiceDAO<DataClass, Integer>{

	@Autowired
	private DataClassRepo dataClassRepo;

	@Override
	public DataClass get(Integer entityID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DataClass> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(DataClass entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(List<DataClass> entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(DataClass entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(List<DataClass> entity) {
		// TODO Auto-generated method stub
		
	}

}