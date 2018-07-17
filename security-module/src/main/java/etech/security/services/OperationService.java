package etech.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etech.security.core.Authority;
import etech.security.core.Operation;
import etech.security.repositories.OperationRepository;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 23-Apr-2018 9:31:54 AM
 */

@Service
public class OperationService {

	@Autowired
	public OperationRepository operationRepository;

	/**
	 * 
	 * @param operationID
	 */
	public List<Authority> getOperationAuthorities(int operationID){
		return operationRepository.findById(operationID).get().getAuthorities();
	}

	/**
	 * 
	 * @param opration
	 */
	public Operation save(Operation operation){
		return operationRepository.save(operation);
	}

}