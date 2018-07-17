package com.etech.ecapture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etech.ecapture.entities.Permission;
import com.etech.ecapture.repositories.PermissionRepo;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 3:07:28 PM
 */

@Service
public class PermissionServiceImpl implements ServiceDAO<Permission, Integer>{ 

	@Autowired
	private PermissionRepo permissionRepo;

	@Override
	public Permission get(Integer entityID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Permission> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Permission entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(List<Permission> entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Permission entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(List<Permission> entity) {
		// TODO Auto-generated method stub
		
	}

}