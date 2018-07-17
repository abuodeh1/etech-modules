package com.etech.ecapture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etech.ecapture.entities.User;
import com.etech.ecapture.repositories.UserRepo;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 3:07:28 PM
 */

@Service
public class UserServiceImpl implements ServiceDAO<User, Integer>{

	@Autowired
	private UserRepo userRepo;

	@Override
	public User get(Integer entityID) {
		return userRepo.findById(entityID).get();
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(List<User> entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(List<User> entity) {
		// TODO Auto-generated method stub
		
	}

}