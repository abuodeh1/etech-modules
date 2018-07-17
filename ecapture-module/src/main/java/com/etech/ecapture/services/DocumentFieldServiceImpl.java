package com.etech.ecapture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etech.ecapture.entities.DocumentField;
import com.etech.ecapture.repositories.DocumentFieldRepo;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 3:07:26 PM
 */

@Service
public class DocumentFieldServiceImpl implements ServiceDAO<DocumentField, Integer>{ 

	@Autowired
	private DocumentFieldRepo documentFieldRepo;

	@Override
	public DocumentField get(Integer entityID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DocumentField> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(DocumentField entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(List<DocumentField> entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(DocumentField entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(List<DocumentField> entity) {
		// TODO Auto-generated method stub
		
	}
	
}