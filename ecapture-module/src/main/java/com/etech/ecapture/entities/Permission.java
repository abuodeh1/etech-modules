package com.etech.ecapture.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 13-Dec-2017 2:23:47 PM
 */

@Entity
@Table(name = "ECAPTURE_PERMISSION", schema="MOH")
public class Permission {

    @Id
    @Column(name="PERMISSION_ID", nullable = false)
    private int permissionID;

    @Column(name="PERMISSION_STATUS")
    private short permissionStatus;
    @Column(name="PERMISSION_TITLE", length = 50)
    private String permissionTitle;
    
    @ManyToOne
    @JoinColumn(name = "PERMISSION_PARENT_ID")
    private Permission permission;
    
    @OneToMany(mappedBy = "permission")
    private List<Permission> permissions;

  //public List<Role> roles;
    
	public int getPermissionID() {
		return permissionID;
	}

	public void setPermissionID(int permissionID) {
		this.permissionID = permissionID;
	}

	public short getPermissionStatus() {
		return permissionStatus;
	}

	public void setPermissionStatus(short permissionStatus) {
		this.permissionStatus = permissionStatus;
	}

	public String getPermissionTitle() {
		return permissionTitle;
	}

	public void setPermissionTitle(String permissionTitle) {
		this.permissionTitle = permissionTitle;
	}

	public Permission getPermission() {
		return permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	
}