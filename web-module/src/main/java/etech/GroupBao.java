package etech;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import etech.security.core.Group;
import etech.security.services.GroupService;

@ManagedBean
@RequestScoped
public class GroupBao {

	public Group group;
	
	@ManagedProperty("#{groupService}")
	private GroupService groupService;
	
	public GroupBao() {
		group = new Group();
	}
	
	public String addGroup() {
	
		groupService.save(group);
		
		System.out.println(groupService.getGroupByGroupID(group.getGroupID()).toString());
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Added Successfully.....") );
		
		return null;
	}
	
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}


	public GroupService getGroupService() {
		return groupService;
	}

	public void setGroupService(GroupService groupService) {
		this.groupService = groupService;
	}
	
	
}
