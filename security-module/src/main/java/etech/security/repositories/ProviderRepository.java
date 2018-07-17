package etech.security.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import etech.security.core.Provider;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 23-Apr-2018 9:31:51 AM
 */

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Integer> {

	List<Provider> findByProviderActivityStatus(boolean isActive);
	
}