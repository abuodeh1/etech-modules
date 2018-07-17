package etech.security.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import etech.security.core.Group;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 23-Apr-2018 9:31:45 AM
 */

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer> {

	/**
	 * 
	 * @param name
	 */
	
	@Query
	public List<Group> findByGroupNameIgnoreLocale(String name);
	
	public List<Group> findByParentGroup(Group parentgroup);

}