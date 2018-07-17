package com.etech.ecapture.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 13-Dec-2017 12:28:25 PM
 */

@Entity
@Table(name = "ECAPTURE_ACTION_GROUP", schema="MOH")
public class ActionGroup {
	
	@Id
    @Column(name="ACTION_GROUP_ID", nullable = false)
    private int actionGroupID;
    
	@Column(name="ACTION_GROUP_DESC", length = 150)
    private String actionGroupDesc;
    @Column(name="ACTION_GROUP_NAME", nullable = false, length = 50)
    private String actionGroupName;
    @Column(name="ACTION_GROUP_NAME_AR", length = 50)
    private String actionGroupNameAr;
    
    @OneToMany(mappedBy = "actionGroup", fetch = FetchType.EAGER)
    private List<Action> actions;

    public String toString() {
    	return "ActionGroupID: " + actionGroupID;
    }
    
	public int getActionGroupID() {
		return actionGroupID;
	}

	public void setActionGroupID(int actionGroupID) {
		this.actionGroupID = actionGroupID;
	}

	public String getActionGroupDesc() {
		return actionGroupDesc;
	}

	public void setActionGroupDesc(String actionGroupDesc) {
		this.actionGroupDesc = actionGroupDesc;
	}

	public String getActionGroupName() {
		return actionGroupName;
	}

	public void setActionGroupName(String actionGroupName) {
		this.actionGroupName = actionGroupName;
	}

	public String getActionGroupNameAr() {
		return actionGroupNameAr;
	}

	public void setActionGroupNameAr(String actionGroupNameAr) {
		this.actionGroupNameAr = actionGroupNameAr;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

}