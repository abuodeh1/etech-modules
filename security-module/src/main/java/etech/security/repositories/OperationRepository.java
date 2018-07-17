package etech.security.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import etech.security.core.Operation;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 23-Apr-2018 9:31:50 AM
 */

@Repository
public interface OperationRepository extends JpaRepository<Operation, Integer> {

	/**
	 * 
	 * @param name
	 */
	@Query
	public List<Operation> findByOperationNameIgnoreLocale(String name);

}