package etech.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etech.security.core.Authority;
import etech.security.core.Provider;
import etech.security.repositories.ProviderRepository;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 23-Apr-2018 9:31:54 AM
 */

@Service
public class ProviderService {

	@Autowired
	public ProviderRepository providerRepository;

	/**
	 * 
	 * @param provider
	 */
	public void delete(Provider provider){
		providerRepository.delete(provider);
	}

	/**
	 * 
	 * @param providerID
	 */
	public Provider getProviderByProviderID(int providerID){
		return providerRepository.findById(providerID).get();
	}
	
	/**
	 * 
	 * @param isActive
	 */
	public List<Provider> getProvidersByActivityStatus(boolean isActive){
		return providerRepository.findByProviderActivityStatus(isActive);
	}

	/**
	 * 
	 * @param provider
	 */
	public void save(Provider provider){
		providerRepository.save(provider);
	}

	public List<Provider> getAllProviders() {
		
		return providerRepository.findAll();
	}

}