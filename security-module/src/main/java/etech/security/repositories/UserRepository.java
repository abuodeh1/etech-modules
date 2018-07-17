package etech.security.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import etech.security.core.User;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 23-Apr-2018 9:31:45 AM
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	/**
	 * 
	 * @param aliasCode
	 */
	public User findByUserAliasCode(String aliasCode);

	public List<User> findByManager(User manager);

	/**
	 * 
	 * @param isLocked
	 */
	public List<User> findByUserLocked(boolean isLocked);

	/**
	 * 
	 * @param mailID
	 */
	public User findByUserMailID(String mailID);

	/**
	 * 
	 * @param name
	 */
	@Query
	public List<User> findByUserNameIgnoreLocale(String name);

	/**
	 * 
	 * @param nickname
	 */
	public User findByUserNickname(String nickname);
	
	/**
	 * 
	 * @param isActive
	 */
	public List<User> findByUserActivityStatus(boolean isActive);

}