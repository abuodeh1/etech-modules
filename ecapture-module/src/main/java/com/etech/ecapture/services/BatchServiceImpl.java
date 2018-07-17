package com.etech.ecapture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etech.ecapture.entities.Batch;
import com.etech.ecapture.repositories.BatchRepository;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 2:35:48 PM
 */

@Service
public class BatchServiceImpl{

	@Autowired
	private BatchRepository batchRepo;


	public List<Batch> getBatchsNameIgnoreLocale(String batchName) {
		return batchRepo.filterXYZ(batchName);
	}


}