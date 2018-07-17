package com.etech.ecapture.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.etech.ecapture.entities.Batch;

@Repository
@Transactional(readOnly = true)
public class BatchRepositoryImpl implements BatchRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Batch> filterXYZ(String batchName) {
		Query query = entityManager.createQuery("select b from Batch b where b.batchName like :batchName");
		query.setParameter("batchName", batchName);
		
		return query.getResultList();
		
	}

}
