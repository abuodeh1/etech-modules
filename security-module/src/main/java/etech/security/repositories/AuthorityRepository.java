package etech.security.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import etech.security.core.Authority;
import java.lang.String;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 23-Apr-2018 9:31:48 AM
 */

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Integer> {

	/**
	 * 
	 * @param name
	 */
	@Query
	public List<Authority> findByAuthorityNameIgnoreLocale(String name);
	
	public List<Authority> findByAuthorityActivityStatus(boolean isActive);

	public Authority findByAuthorityCode(String authoritycode);
	
}