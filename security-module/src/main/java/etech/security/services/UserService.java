package etech.security.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etech.security.core.Authority;
import etech.security.core.User;
import etech.security.repositories.UserRepository;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 23-Apr-2018 9:31:52 AM
 */

@Service
public class UserService {

	@Autowired
	public UserRepository userRepository;

	/**
	 * 
	 * @param user
	 */
	public void delete(User user){
		userRepository.delete(user);
	}

	/**
	 * 
	 * @param aliasCode
	 */
	public User getUserByAliasCode(String aliasCode){
		return userRepository.findByUserAliasCode(aliasCode);
	}

	/**
	 * 
	 * @param mailID
	 */
	public User getUserByMailID(String mailID){
		return userRepository.findByUserMailID(mailID);
	}

	/**
	 * 
	 * @param name
	 */
	public List<User> getUserByName(String name){
		return userRepository.findByUserNameIgnoreLocale(name);
	}

	/**
	 * 
	 * @param nickname
	 */
	public User getUserByNickname(String nickname){
		return userRepository.findByUserNickname(nickname);
	}

	/**
	 * 
	 * @param userID
	 */
	public User getUserByUserID(int userID){
		return userRepository.findById(userID).get();
	}

	/**
	 * 
	 * @param isActive
	 */
	public List<User> getUsersByActivityStatus(boolean isActive){
		return userRepository.findByUserActivityStatus(isActive);
	}

	/**
	 * 
	 * @param manager
	 */
	public List<User> getUsersByManagerID(User manager){
		return userRepository.findByManager(manager);
	}

	/**
	 * 
	 * @param user
	 */
	public User save(User user){
		return userRepository.save(user);
	}
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}

	public List<Authority> getUserAuthorities(int userID) {
		
		EntityGraph<User> graph = entityManager.createEntityGraph(User.class);
		graph.addAttributeNodes("authorities");

		Map<String, Object> hints = new HashMap<String, Object>();
		hints.put("javax.persistence.loadgraph", graph);

		
		return entityManager.find(User.class, userID, hints).getAuthorities();
	}
	
	@Transactional
	public List<User> getAudited(int userID){
		
		AuditReader auditReader = AuditReaderFactory.get(entityManager);
		
		List<User> users = new ArrayList<>();

		List<Number> versions = auditReader.getRevisions(User.class, userID);
		for (Number version : versions) {
			users.add( auditReader.find(User.class, userID, version) );
		}
		
		return users;
	}

	@PersistenceContext
	EntityManager entityManager;
	
}