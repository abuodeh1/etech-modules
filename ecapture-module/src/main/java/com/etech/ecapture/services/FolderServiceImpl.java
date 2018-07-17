package com.etech.ecapture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etech.ecapture.entities.Field;
import com.etech.ecapture.repositories.FolderRepo;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 3:07:26 PM
 */

@Service
public class FolderServiceImpl implements ServiceDAO<Field, Integer>{ 

	@Autowired
	private FolderRepo folderRepo;

	@Override
	public Field get(Integer entityID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Field> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Field entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(List<Field> entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Field entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(List<Field> entity) {
		// TODO Auto-generated method stub
		
	}

}