package com.etech.ecapture.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 13-Dec-2017 2:23:47 PM
 */

@Entity
@Table(name = "ECAPTURE_ROLE", schema="MOH")
public class Role {

    @Id
    @Column(name="ROLE_ID", nullable = false)
    private int roleID;
    
    @Column(name="ROLE_STATUS")
    private short roleStatus;
    @Column(name="ROLE_TITLE", nullable = false, length = 50)
    private String roleTitle;
    
//  public List<Group> groups;
//	public List<User> users;
//	public List<Permission> permissions;
    
	public int getRoleID() {
		return roleID;
	}
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}
	public short getRoleStatus() {
		return roleStatus;
	}
	public void setRoleStatus(short roleStatus) {
		this.roleStatus = roleStatus;
	}
	public String getRoleTitle() {
		return roleTitle;
	}
	public void setRoleTitle(String roleTitle) {
		this.roleTitle = roleTitle;
	}

}