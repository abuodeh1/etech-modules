package etech.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etech.security.core.Group;
import etech.security.repositories.GroupRepository;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 23-Apr-2018 9:31:52 AM
 */

@Service
public class GroupService {

	@Autowired
	public GroupRepository groupRepository;

	/**
	 * 
	 * @param group
	 */
	public void delete(Group group){
		groupRepository.delete(group);
	}

	/**
	 * 
	 * @param groupID
	 */
	public Group getGroupByGroupID(int groupID){
		return groupRepository.findById(groupID).get();
	}

	/**
	 * 
	 * @param groupName
	 */
	public List<Group> getGroupByGroupName(String groupName){
		return groupRepository.findByGroupNameIgnoreLocale(groupName);
	}

	/**
	 * 
	 * @param group
	 */
	public Group save(Group group){
		return groupRepository.save(group);
	}
	
	/**
	 * 
	 * @param parentgroup
	 */
	public List<Group> getGroupsByParentGroup(Group parentgroup){
		
		return groupRepository.findByParentGroup(parentgroup);
	}

}