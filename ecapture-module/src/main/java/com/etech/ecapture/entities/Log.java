package com.etech.ecapture.entities;

import java.util.Date;
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
 * @created 13-Dec-2017 12:28:26 PM
 */

@Entity
@Table(name = "ECAPTURE_LOG", schema="MOH")
public class Log {
	
	@Id
    @Column(name="LOG_ID", nullable = false)
    private int logID;
    	
	@Column(name="LOG_ALIAS", length = 50)
    private String logAlias;
    @Column(name="LOG_DATETIME", nullable = false)
    private Date logDatetime;
    @OneToMany(mappedBy = "log")
    private List<LogMail> logMails;
    @OneToMany(mappedBy = "log")
    private List<LogComponent> logComponents;
    
    @ManyToOne
    @JoinColumn(name = "ACTION_ID")
    private Action action;
    
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

	public int getLogID() {
		return logID;
	}

	public void setLogID(int logID) {
		this.logID = logID;
	}

	public String getLogAlias() {
		return logAlias;
	}

	public void setLogAlias(String logAlias) {
		this.logAlias = logAlias;
	}

	public Date getLogDatetime() {
		return logDatetime;
	}

	public void setLogDatetime(Date logDatetime) {
		this.logDatetime = logDatetime;
	}

	public List<LogMail> getLogMails() {
		return logMails;
	}

	public void setLogMails(List<LogMail> logMails) {
		this.logMails = logMails;
	}

	public List<LogComponent> getLogComponents() {
		return logComponents;
	}

	public void setLogComponents(List<LogComponent> logComponents) {
		this.logComponents = logComponents;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}