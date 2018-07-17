package etech.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etech.security.core.Authority;
import etech.security.repositories.AuthorityRepository;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 23-Apr-2018 9:31:53 AM
 */

@Service
public class AuthorityService {

	@Autowired
	public AuthorityRepository authorityRepository;

	/**
	 * 
	 * @param authority
	 */
	public void delete(Authority authority){
		authorityRepository.delete(authority);
	}

	/**
	 * 
	 * @param isActive
	 */
	public List<Authority> getAthoritiesByActivityStatus(boolean isActive){
		return authorityRepository.findByAuthorityActivityStatus(isActive);
	}

	/**
	 * 
	 * @param authorityName
	 */
	public List<Authority> getAuthorityByName(String authorityName){
		return authorityRepository.findByAuthorityNameIgnoreLocale(authorityName);
	}

	/**
	 * 
	 * @param authority
	 */
	public Authority save(Authority authority){
		return authorityRepository.save(authority);
	}

	/**
	 * 
	 * @param authorityID
	 */
	public Authority getAuthorityByAuthorityID(int authorityID) {
		
		return authorityRepository.findById(authorityID).get();
	}
	
	/**
	 * 
	 * @param authorityCode
	 */
	public Authority getAuthorityByAuthorityCode(String authorityCode) {
		
		return authorityRepository.findByAuthorityCode(authorityCode);
	}
	
	public List<Authority> getAllAuthorities() {
		
		return authorityRepository.findAll();
	}
}