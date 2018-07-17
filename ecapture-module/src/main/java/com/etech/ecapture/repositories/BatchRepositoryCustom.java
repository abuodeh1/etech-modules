package com.etech.ecapture.repositories;

import java.util.List;

import com.etech.ecapture.entities.Batch;

public interface BatchRepositoryCustom {
	
	List<Batch> filterXYZ(String batchName);
	
}
