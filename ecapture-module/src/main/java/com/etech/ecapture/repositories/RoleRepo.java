package com.etech.ecapture.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etech.ecapture.entities.Role;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 9:51:11 AM
 */
@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {
	
}