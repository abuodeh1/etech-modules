package com.etech.ecapture.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.etech.ecapture.entities.Group;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 14-Dec-2017 9:51:10 AM
 */
@Repository
public interface GroupRepo extends JpaRepository<Group, Integer> {

	@Query
	List<Group> findByGroupNameIgnoreLcale(String groupnamear);

}