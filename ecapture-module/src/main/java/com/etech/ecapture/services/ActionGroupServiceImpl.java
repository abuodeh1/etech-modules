package com.etech.ecapture.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etech.ecapture.repositories.ActionGroupRepository;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 2:36:18 PM
 */

@Service
public class ActionGroupServiceImpl {

	@Autowired
	private ActionGroupRepository actionGroupRepo;

}