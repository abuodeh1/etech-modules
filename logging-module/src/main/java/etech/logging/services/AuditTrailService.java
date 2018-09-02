package etech.logging.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etech.logging.core.AuditTrail;
import etech.logging.repositories.AuditTrailRepository;

@Service
public class AuditTrailService {

	@Autowired
	private AuditTrailRepository auditTrailRepository;
	
	
	public AuditTrail save(AuditTrail auditTrail){
		return auditTrailRepository.save(auditTrail);
	}
	
}
