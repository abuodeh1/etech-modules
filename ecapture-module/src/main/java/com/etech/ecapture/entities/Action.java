package com.etech.ecapture.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author mabuodeh
 * @version 1.0
 * @created 13-Dec-2017 12:28:25 PM
 */

@Entity
@Table(name = "ECAPTURE_ACTION", schema="MOH")
public class Action{

	@Id
    @Column(name="ACTION_ID", nullable = false)
    private int actionID;
    
	@Column(name="ACTION_ALIAS", length = 50)
    private String actionAlias;
    @Column(name="ACTION_DESC", length = 150)
    private String actionDesc;
    @Column(name="ACTION_NAME", nullable = false, length = 50)
    private String actionName;
    @Column(name="ACTION_NAME_AR", length = 50)
    private String actionNameAr;
    
    @ManyToOne
    @JoinColumn(name = "ACTION_GROUP_ID")
    private ActionGroup actionGroup;
    
    /*@OneToMany(mappedBy = "action", fetch=FetchType.LAZY)
    private List<Log> logs;*/
    
    public String toString() {
    	return "ActionID: " + actionID;
    }
    
	public int getActionID() {
		return actionID;
	}

	public void setActionID(int actionID) {
		this.actionID = actionID;
	}

	public String getActionAlias() {
		return actionAlias;
	}

	public void setActionAlias(String actionAlias) {
		this.actionAlias = actionAlias;
	}

	public String getActionDesc() {
		return actionDesc;
	}

	public void setActionDesc(String actionDesc) {
		this.actionDesc = actionDesc;
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getActionNameAr() {
		return actionNameAr;
	}

	public void setActionNameAr(String actionNameAr) {
		this.actionNameAr = actionNameAr;
	}

	public ActionGroup getActionGroup() {
		return actionGroup;
	}

	public void setActionGroup(ActionGroup actionGroup) {
		this.actionGroup = actionGroup;
	}

	/*public List<Log> getLogs() {
		return logs;
	}

	public void setLogs(List<Log> logs) {
		this.logs = logs;
	}*/

}