package com.etech.ecapture.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 13-Dec-2017 2:23:46 PM
 */
@Entity
@Table(name="ECAPTURE_GROUP", schema="MOH")
@NamedQueries({
	@NamedQuery(name="Group.findByGroupNameIgnoreLcale", query="select g from Group g where g.groupName like ?1 or g.groupNameAr like ?1")
	
})
public class Group {

	@Id
    @Column(name="GROUP_ID", nullable = false)
    private Double groupID;
    
    @Column(name="GROUP_DESC", length = 150)
    private String groupDesc;
    @Column(name="GROUP_NAME", nullable = false, length = 50)
    private String groupName;
    @Column(name="GROUP_NAME_AR", length = 50)
    private String groupNameAr;
    
    @ManyToOne
    @JoinColumn(name = "GROUP_PARENT_ID")
    private Group group;
    
    @OneToMany(mappedBy = "group")
    private List<Group> groups;

//  public List<Role> roles;
//  public List<User> users;
    
	public Double getGroupID() {
		return groupID;
	}

	public void setGroupID(Double groupID) {
		this.groupID = groupID;
	}

	public String getGroupDesc() {
		return groupDesc;
	}

	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupNameAr() {
		return groupNameAr;
	}

	public void setGroupNameAr(String groupNameAr) {
		this.groupNameAr = groupNameAr;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}
    
}