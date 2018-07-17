package com.etech.ecapture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etech.ecapture.entities.Role;
import com.etech.ecapture.repositories.RoleRepo;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 3:07:28 PM
 */

@Service
public class RoleServiceImpl implements ServiceDAO<Role, Integer>{

	@Autowired
	private RoleRepo roleRepo;

	@Override
	public Role get(Integer entityID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Role entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(List<Role> entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Role entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(List<Role> entity) {
		// TODO Auto-generated method stub
		
	}

}