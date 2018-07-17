package com.etech.ecapture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etech.ecapture.entities.Document;
import com.etech.ecapture.repositories.DocumentRepo;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 2:35:48 PM
 */

@Service
public class DocumentServiceImpl implements ServiceDAO<Document, Integer>{ 

	@Autowired
	private DocumentRepo documentRepo;

	@Override
	public Document get(Integer entityID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Document> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Document entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(List<Document> entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Document entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(List<Document> entity) {
		// TODO Auto-generated method stub
		
	}

}